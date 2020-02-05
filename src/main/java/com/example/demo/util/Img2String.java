package com.example.demo.util;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Random;

public class Img2String implements Runnable{
    private String url;
    public Img2String(String url){
        this.url = url;
    }
    /**
     * 将图片转换为字符串
     * @throws Exception
     */
    public String image2txt() {
        String str = ".:!$";
        int[] rgb = new int[3];
        File file = new File(url);
        BufferedImage bi = null;
        try {
            bi = ImageIO.read(file);
        } catch (Exception e) {
            return null;
        }
        int width = bi.getWidth();
        int height = bi.getHeight();
        int minx = bi.getMinX();
        int miny = bi.getMinY();
        StringBuilder sb=new StringBuilder();
        for (int i = miny; i < height; i+=5) {
            for (int j = minx; j < width; j+=5) {
                int pixel = bi.getRGB(j, i); // 下面三行代码将一个数字转换为RGB数字
                rgb[0] = (pixel & 0xff0000) >> 16;
                rgb[1] = (pixel & 0xff00) >> 8;
                rgb[2] = (pixel & 0xff);
                //判断接近白色还是黑色，接近白色写入空格，接近黑色写入字符串
                if (rgb[0] > 200&&rgb[1]>200&&rgb[2]>200) {
                    sb.append(str.charAt(0));
                } else if (rgb[0] > 150&&rgb[1]>150&&rgb[2]>150){
                    sb.append(str.charAt(1));
                }else if (rgb[0] > 100&&rgb[1]>100&&rgb[2]>100){
                    sb.append(str.charAt(2));
                }else {
                    sb.append(str.charAt(3));
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    /**
     * 将字符串写入文件
     * @param filePath
     * @param content
     */
    public void writeToTxt(String filePath, String content) {
        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath, true),"UTF-8"));
            out.write(content);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 将bufferImage写入图片
     * @param path
     * @param image
     */
    public void writeToImg(String path,BufferedImage image){
        try {
            ImageIO.write(image, "jpg", new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void run() {
        image2txt();
//        writeToImg(image, "d:mine.jpg");
    }
}
