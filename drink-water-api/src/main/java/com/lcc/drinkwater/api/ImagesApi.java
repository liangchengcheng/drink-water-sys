package com.lcc.drinkwater.api;

import com.lcc.drinkwater.response.ImageResponse;
import com.lcc.drinkwater.vo.Image;
import com.lcc.water.common.base.BaseService;
import java.util.List;

public interface ImagesApi extends BaseService<Image, String> {

    //根据排查情况查找图片
    List<ImageResponse> findInvestigationImageById(String id);

    //根据整治情况查找图片
    List<ImageResponse> findRemediationImageById(String id);

    //添加图片
    boolean addImage(String imageName, int imageType, byte[] image);

    //更新图片
    boolean updateImage(Image image);

    //获取图片
    Image getImage(String id);

    List<ImageResponse> getImageListByTypeAndMapperId(int type, String mapperId);
}
