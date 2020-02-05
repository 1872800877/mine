package com.example.demo.util;

import com.alibaba.fastjson.JSONObject;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PostHandle {
    public static JSONObject PostHandleJson(HttpServletRequest request){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));
            StringBuffer sb=new StringBuffer();
            String s=null;
            while((s=br.readLine())!=null){
                sb.append(s);
            }
            return JSONObject.parseObject(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
