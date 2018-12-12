package com.zxyy.yusx.myddc.utils;



public class WxApiUtil {

    private static String APPID = "wx2fca5b9f038dc8fc";
    private static String APPSECRET = "722f33f514ac369da9513cc4885551db";

    public static String getAccessToken(){
        String url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid="+APPID+"&secret="+APPSECRET;
        String s = "";
        System.out.println(s);
        return s;
    }

    public static void main(String[] args) {
        getAccessToken();
    }
}
