package com.imooc;

import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.message.BasicNameValuePair;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ZhangLei
 * @date 2020-06-04 10:56
 */
public class zhanglTest {

    public static void main(String[] args) {

        List<NameValuePair> nvps = new ArrayList<>();
        nvps.add(new BasicNameValuePair("coord_type", "3")); // 百度坐标系
        nvps.add(new BasicNameValuePair("geotable_id", "175730"));
        nvps.add(new BasicNameValuePair("ak", "BAIDU_MAP_KEY"));
        nvps.add(new BasicNameValuePair("houseId", String.valueOf("1234")));
        nvps.add(new BasicNameValuePair("price", String.valueOf("12.56")));
        nvps.add(new BasicNameValuePair("area", String.valueOf("98")));
        nvps.add(new BasicNameValuePair("title", "标题"));
        nvps.add(new BasicNameValuePair("address", "地址"));
        try {
            HttpPost httpPost = new HttpPost("asd");
            httpPost.setEntity(new UrlEncodedFormEntity(nvps, "UTF-8"));
            System.out.println(httpPost.toString());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }
}
