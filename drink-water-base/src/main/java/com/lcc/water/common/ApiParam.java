package com.lcc.water.common;

import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;

public class ApiParam implements Serializable {

    private Header header;

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public static class Header implements Serializable {
        // 当前APP版本号
        private String appVer;
        // 设备唯一表示
        private String deviceId;
        //用户名
        private String userName;
        // Md5加密（手机号+密码）
        private String token;
        // 发布市场编码
        private String mc;

        public Header fillBy(HttpServletRequest request) {
            this.setAppVer(request.getHeader("appVer"));
            this.setDeviceId(request.getHeader("deviceId"));
            this.setUserName(request.getHeader("userName"));
            this.setToken(request.getHeader("token"));
            this.setMc(request.getHeader("mc"));
            return this;
        }

        public String getAppVer() {
            return appVer;
        }

        public void setAppVer(String appVer) {
            this.appVer = appVer;
        }

        public String getDeviceId() {
            return deviceId;
        }

        public void setDeviceId(String deviceId) {
            this.deviceId = deviceId;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public String getMc() {
            return mc;
        }

        public void setMc(String mc) {
            this.mc = mc;
        }

    }
}

