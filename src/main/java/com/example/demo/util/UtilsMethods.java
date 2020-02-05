package com.example.demo.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import java.util.Random;

public class UtilsMethods {
    public static BufferedImage string2img(String imgStr){
        String[] list = imgStr.split("\n");
        int fontSize = 18;
        int width = list[0].length()*fontSize;
        int height = list.length*fontSize;
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        // 获取图形上下文
        Graphics g = image.getGraphics();
        // 生成随机类
        Random random = new Random();
        // 设定背景色
        g.setColor(new Color(255, 255, 255));
        g.fillRect(0, 0, width, height);
        // 设定字体
        g.setFont(new Font("宋体",Font.PLAIN,fontSize*2));
        g.setColor(new Color(0,0,0));
        for (int i=0;i<list.length;i++){
            g.drawString(list[i], 0, fontSize*i);
        }
        g.dispose();
        return image;
    }
}
