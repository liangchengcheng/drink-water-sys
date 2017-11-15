package com.lcc.drinkwater.excel;

import com.lcc.drinkwater.excel.handler.ExcelHeader;
import com.lcc.drinkwater.excel.handler.ExcelTemplate;
import com.lcc.drinkwater.excel.utils.Utils;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExcelUtils {

    static private ExcelUtils excelUtils = new ExcelUtils();

    private ExcelUtils() {
    }

    public static ExcelUtils getInstance() {
        return excelUtils;
    }

    /*----------------------------------------读取Excel操作基于注解映射---------------------------------------------*/
    /*  一. 操作流程 ：                                                                                            */
    /*      1) 读取表头信息,与给出的Class类注解匹配                                                                  */
    /*      2) 读取表头下面的数据内容, 按行读取, 并映射至java对象                                                      */
    /*  二. 参数说明                                                                                               */
    /*      *) excelPath        =>      目标Excel路径                                                              */
    /*      *) InputStream      =>      目标Excel文件流                                                            */
    /*      *) clazz            =>      java映射对象                                                               */
    /*      *) offsetLine       =>      开始读取行坐标(默认0)                                                       */
    /*      *) limitLine        =>      最大读取行数(默认表尾)                                                      */
    /*      *) sheetIndex       =>      Sheet索引(默认0)                                                           */

    public <T> List<T> readExcel2Objects(String excelPath, Class<T> clazz, int offsetLine, int limitLine, int
            sheetIndex) throws Exception {
        Workbook workbook = WorkbookFactory.create(new File(excelPath));
        return readExcel2ObjectsHandler(workbook, clazz, offsetLine, limitLine, sheetIndex);
    }

    public <T> List<T> readExcel2Objects(InputStream is, Class<T> clazz, int offsetLine, int limitLine, int
            sheetIndex) throws Exception {
        Workbook workbook = WorkbookFactory.create(is);
        return readExcel2ObjectsHandler(workbook, clazz, offsetLine, limitLine, sheetIndex);
    }

    public <T> List<T> readExcel2Objects(String excelPath, Class<T> clazz, int sheetIndex)
            throws Exception {
        return readExcel2Objects(excelPath, clazz, 0, Integer.MAX_VALUE, sheetIndex);
    }

    public <T> List<T> readExcel2Objects(String excelPath, Class<T> clazz)
            throws Exception {
        return readExcel2Objects(excelPath, clazz, 0, Integer.MAX_VALUE, 0);
    }


    public <T> List<T> readExcel2Objects(InputStream is, Class<T> clazz, int sheetIndex)
            throws Exception {
        return readExcel2Objects(is, clazz, 0, Integer.MAX_VALUE, sheetIndex);
    }

    public <T> List<T> readExcel2Objects(InputStream is, Class<T> clazz)
            throws Exception {
        return readExcel2Objects(is, clazz, 0, Integer.MAX_VALUE, 0);
    }

    private <T> List<T> readExcel2ObjectsHandler(Workbook workbook, Class<T> clazz, int offsetLine, int limitLine,
                                                 int sheetIndex) throws Exception {
        Sheet sheet = workbook.getSheetAt(sheetIndex);
        Row row = sheet.getRow(offsetLine);
        List<T> list = new ArrayList<>();
        Map<Integer, ExcelHeader> maps = Utils.getHeaderMap(row, clazz);
        if (maps == null || maps.size() <= 0)
            throw new RuntimeException("要读取的Excel的格式不正确，检查是否设定了合适的行");
        int maxLine = sheet.getLastRowNum() > (offsetLine + limitLine) ? (offsetLine + limitLine) : sheet
                .getLastRowNum();
        for (int i = offsetLine + 1; i <= maxLine; i++) {
            row = sheet.getRow(i);
            T obj = clazz.newInstance();
            for (Cell cell : row) {
                int ci = cell.getColumnIndex();
                ExcelHeader header = maps.get(ci);
                if (null == header)
                    continue;
                String filed = header.getFiled();
                String val = Utils.getCellValue(cell);
                Object value = Utils.str2TargetClass(val, header.getFiledClazz());
                BeanUtils.copyProperty(obj, filed, value);
            }
            list.add(obj);
        }
        return list;
    }

    /*----------------------------------------读取Excel操作无映射--------------------------------------------------*/
    /*  一. 操作流程 ：                                                                                            */
    /*      *) 按行读取Excel文件,存储形式为  Cell->String => Row->List<Cell> => Excel->List<Row>                    */
    /*  二. 参数说明                                                                                               */
    /*      *) excelPath        =>      目标Excel路径                                                              */
    /*      *) InputStream      =>      目标Excel文件流                                                            */
    /*      *) offsetLine       =>      开始读取行坐标(默认0)                                                       */
    /*      *) limitLine        =>      最大读取行数(默认表尾)                                                      */
    /*      *) sheetIndex       =>      Sheet索引(默认0)                                                           */

    public List<List<String>> readExcel2List(String excelPath, int offsetLine, int limitLine, int sheetIndex)
            throws Exception {

        Workbook workbook = WorkbookFactory.create(new File(excelPath));
        return readExcel2ObjectsHandler(workbook, offsetLine, limitLine, sheetIndex);
    }

    public List<List<String>> readExcel2List(InputStream is, int offsetLine, int limitLine, int sheetIndex)
            throws Exception {

        Workbook workbook = WorkbookFactory.create(is);
        return readExcel2ObjectsHandler(workbook, offsetLine, limitLine, sheetIndex);
    }

    public List<List<String>> readExcel2List(String excelPath, int offsetLine)
            throws Exception {

        Workbook workbook = WorkbookFactory.create(new File(excelPath));
        return readExcel2ObjectsHandler(workbook, offsetLine, Integer.MAX_VALUE, 0);
    }

    public List<List<String>> readExcel2List(InputStream is, int offsetLine)
            throws Exception {

        Workbook workbook = WorkbookFactory.create(is);
        return readExcel2ObjectsHandler(workbook, offsetLine, Integer.MAX_VALUE, 0);
    }

    public List<List<String>> readExcel2List(String excelPath)
            throws Exception {

        Workbook workbook = WorkbookFactory.create(new File(excelPath));
        return readExcel2ObjectsHandler(workbook, 0, Integer.MAX_VALUE, 0);
    }

    public List<List<String>> readExcel2List(InputStream is)
            throws Exception {

        Workbook workbook = WorkbookFactory.create(is);
        return readExcel2ObjectsHandler(workbook, 0, Integer.MAX_VALUE, 0);
    }

    private List<List<String>> readExcel2ObjectsHandler(Workbook workbook, int offsetLine, int limitLine, int
            sheetIndex)
            throws Exception {

        List<List<String>> list = new ArrayList<>();
        Sheet sheet = workbook.getSheetAt(sheetIndex);
        int maxLine = sheet.getLastRowNum() > (offsetLine + limitLine) ? (offsetLine + limitLine) : sheet
                .getLastRowNum();
        for (int i = offsetLine; i <= maxLine; i++) {
            List<String> rows = new ArrayList<>();
            Row row = sheet.getRow(i);
            for (Cell cell : row) {
                String val = Utils.getCellValue(cell);
                rows.add(val);
            }
            list.add(rows);
        }
        return list;
    }


    /*--------------------------------------------基于模板、注解导出excel-------------------------------------------*/
    /*  一. 操作流程 ：                                                                                            */
    /*      1) 初始化模板                                                                                          */
    /*      2) 根据Java对象映射表头                                                                                 */
    /*      3) 写入数据内容                                                                                        */
    /*  二. 参数说明                                                                                               */
    /*      *) templatePath     =>      模板路径                                                                   */
    /*      *) sheetIndex       =>      Sheet索引(默认0)                                                           */
    /*      *) data             =>      导出内容List集合                                                            */
    /*      *) extendMap        =>      扩展内容Map(具体就是key匹配替换模板#key内容)                                  */
    /*      *) clazz            =>      映射对象Class                                                              */
    /*      *) isWriteHeader    =>      是否写入表头                                                               */
    /*      *) targetPath       =>      导出文件路径                                                               */
    /*      *) os               =>      导出文件流                                                                 */

    public void exportObjects2Excel(String templatePath, int sheetIndex, List<?> data, Map<String, String> extendMap,
                                    Class clazz, boolean isWriteHeader, String targetPath) throws Exception {

        exportExcelByModuleHandler(templatePath, sheetIndex, data, extendMap, clazz, isWriteHeader)
                .write2File(targetPath);
    }

    public void exportObjects2Excel(String templatePath, int sheetIndex, List<?> data, Map<String, String> extendMap,
                                    Class clazz, boolean isWriteHeader, OutputStream os) throws Exception {

        exportExcelByModuleHandler(templatePath, sheetIndex, data, extendMap, clazz, isWriteHeader)
                .write2Stream(os);
    }

    public void exportObjects2Excel(String templatePath, int sheetIndex, List<?> data,List<?> remark, Map<String, String> extendMap,
                                    Class clazz, boolean isWriteHeader, OutputStream os) throws Exception {

        exportExcelByModuleHandler(templatePath, sheetIndex, data, remark,extendMap, clazz, isWriteHeader)
                .write2Stream(os);
    }

    public void exportObjects2Excel(String templatePath, List<?> data, Map<String, String> extendMap, Class clazz,
                                    boolean isWriteHeader, String targetPath) throws Exception {

        exportObjects2Excel(templatePath, 0, data, extendMap, clazz, isWriteHeader, targetPath);
    }

    public void exportObjects2Excel(String templatePath, List<?> data, Map<String, String> extendMap, Class clazz,
                                    boolean isWriteHeader, OutputStream os) throws Exception {

        exportObjects2Excel(templatePath, 0, data, extendMap, clazz, isWriteHeader, os);
    }

    public void exportObjects2Excel(String templatePath, List<?> data, Map<String, String> extendMap, Class clazz,
                                    String targetPath) throws Exception {

        exportObjects2Excel(templatePath, 0, data, extendMap, clazz, false, targetPath);
    }

    public void exportObjects2Excel(String templatePath, List<?> data, Map<String, String> extendMap, Class clazz,
                                    OutputStream os) throws Exception {

        exportObjects2Excel(templatePath, 0, data, extendMap, clazz, false, os);
    }

    public void exportObjects2Excel(String templatePath, List<?> data, Class clazz, String targetPath)
            throws Exception {

        exportObjects2Excel(templatePath, 0, data, null, clazz, false, targetPath);
    }

    public void exportObjects2Excel(String templatePath, List<?> data, Class clazz, OutputStream os)
            throws Exception {

        exportObjects2Excel(templatePath, 0, data, null, clazz, false, os);
    }

    private ExcelTemplate exportExcelByModuleHandler(String templatePath, int sheetIndex, List<?> data,
                                                     Map<String, String> extendMap, Class clazz, boolean isWriteHeader)
            throws Exception {

        ExcelTemplate templates = ExcelTemplate.getInstance(templatePath, sheetIndex);
        templates.extendData(extendMap);
        List<ExcelHeader> headers = Utils.getHeaderList(clazz);
        if (isWriteHeader) {
            // 写标题
            templates.createNewRow();
            for (ExcelHeader header : headers) {
                templates.createCell(header.getTitle(), null);
            }
        }

        for (Object object : data) {
            templates.createNewRow();
            templates.insertSerial(null);
            for (ExcelHeader header : headers) {
                templates.createCell(BeanUtils.getProperty(object, header.getFiled()), null);
            }
        }
        return templates;
    }

    private ExcelTemplate exportExcelByModuleHandler(String templatePath, int sheetIndex, List<?> data,List<?> remark,
                                                     Map<String, String> extendMap, Class clazz, boolean isWriteHeader)
            throws Exception {

        ExcelTemplate templates = ExcelTemplate.getInstance(templatePath, sheetIndex);
        templates.extendData(extendMap);
        List<ExcelHeader> headers = Utils.getHeaderList(clazz);
        if (isWriteHeader) {
            // 写标题
            templates.createNewRow();
            for (ExcelHeader header : headers) {
                templates.createCell(header.getTitle(), null);
            }
        }

        for (Object object : data) {
            templates.createNewRow();
            templates.insertSerial(null);
            for (ExcelHeader header : headers) {
                templates.createCell(BeanUtils.getProperty(object, header.getFiled()), null);
            }
        }


        return templates;
    }

    /*---------------------------------------基于模板、注解导出Map数据----------------------------------------------*/
    /*  一. 操作流程 ：                                                                                            */
    /*      1) 初始化模板                                                                                          */
    /*      2) 根据Java对象映射表头                                                                                */
    /*      3) 写入数据内容                                                                                        */
    /*  二. 参数说明                                                                                               */
    /*      *) templatePath     =>      模板路径                                                                  */
    /*      *) sheetIndex       =>      Sheet索引(默认0)                                                          */
    /*      *) data             =>      导出内容Map集合                                                            */
    /*      *) extendMap        =>      扩展内容Map(具体就是key匹配替换模板#key内容)                                 */
    /*      *) clazz            =>      映射对象Class                                                             */
    /*      *) isWriteHeader    =>      是否写入表头                                                              */
    /*      *) targetPath       =>      导出文件路径                                                              */
    /*      *) os               =>      导出文件流                                                                */
    public void exportObject2Excel(String templatePath, int sheetIndex, Map<String, List<?>> data,
                                   Map<String, String> extendMap, Class clazz, boolean isWriteHeader, String targetPath)
            throws Exception {

        exportExcelByModuleHandler(templatePath, sheetIndex, data, extendMap, clazz, isWriteHeader)
                .write2File(targetPath);
    }

    public void exportObject2Excel(String templatePath, int sheetIndex, Map<String, List<?>> data, Map<String, String>
            extendMap, Class clazz, boolean isWriteHeader, OutputStream os) throws Exception {

        exportExcelByModuleHandler(templatePath, sheetIndex, data, extendMap, clazz, isWriteHeader)
                .write2Stream(os);
    }

    public void exportObject2Excel(String templatePath, Map<String, List<?>> data, Map<String, String> extendMap,
                                   Class clazz, String targetPath) throws Exception {

        exportExcelByModuleHandler(templatePath, 0, data, extendMap, clazz, false)
                .write2File(targetPath);
    }

    public void exportObject2Excel(String templatePath, Map<String, List<?>> data, Map<String, String> extendMap,
                                   Class clazz, OutputStream os) throws Exception {

        exportExcelByModuleHandler(templatePath, 0, data, extendMap, clazz, false)
                .write2Stream(os);
    }

    private ExcelTemplate exportExcelByModuleHandler(String templatePath, int sheetIndex, Map<String, List<?>> data,
                                                     Map<String, String> extendMap, Class clazz, boolean isWriteHeader)
            throws Exception {

        ExcelTemplate templates = ExcelTemplate.getInstance(templatePath, sheetIndex);
        templates.extendData(extendMap);
        List<ExcelHeader> headers = Utils.getHeaderList(clazz);
        if (isWriteHeader) {
            // 写标题
            templates.createNewRow();
            for (ExcelHeader header : headers) {
                templates.createCell(header.getTitle(), null);
            }
        }
        for (Map.Entry<String, List<?>> entry : data.entrySet()) {
            for (Object object : entry.getValue()) {
                templates.createNewRow();
                templates.insertSerial(entry.getKey());
                for (ExcelHeader header : headers) {
                    templates.createCell(BeanUtils.getProperty(object, header.getFiled()), entry.getKey());
                }
            }
        }

        return templates;
    }




}
