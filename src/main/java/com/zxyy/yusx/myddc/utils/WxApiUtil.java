package com.zxyy.yusx.myddc.utils;


import com.alibaba.fastjson.JSONObject;
import org.apache.http.client.fluent.Request;

import java.io.IOException;

public class WxApiUtil {

    private static String APPID = "wx2fca5b9f038dc8fc";
    private static String APPSECRET = "722f33f514ac369da9513cc4885551db";

    public static String getAccessToken(){
        String url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid="+APPID+"&secret="+APPSECRET;
        String s = "";
        try {
            s=Request.Get(url)
                    .connectTimeout(1000)
                    .socketTimeout(1000)
                    .execute().returnContent().asString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(s);
        String access_token = "";
        if(!s.isEmpty()){
            JSONObject jo = new JSONObject().getJSONObject(s);
            access_token = (String)jo.get("access_token");

        }
        return access_token;
    }

    public static String getUserInfo(){

        String accessToken = getAccessToken();

        String url = "https://api.weixin.qq.com/cgi-bin/user/info?access_token="+accessToken+"&openid=OPENID&lang=zh_CN";
        String s = "";
        try {
            s=Request.Get(url)
                    .connectTimeout(1000)
                    .socketTimeout(1000)
                    .execute().returnContent().asString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(s);
        String access_token = "";
        if(!s.isEmpty()){
            JSONObject jo = new JSONObject().getJSONObject(s);
            access_token = (String)jo.get("access_token");

        }
        return access_token;
    }

    public static void main(String[] args) {
        getAccessToken();
    }
}
