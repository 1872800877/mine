package com.example.demo.controller;

import ch.qos.logback.core.util.ContentTypeUtil;
import com.example.demo.util.Img2String;
import com.example.demo.util.UpDownloadUtils;
import com.example.demo.util.UtilsMethods;
import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.List;

import static org.apache.naming.ContextBindings.getClassLoader;

@Controller
@RequestMapping(value = "common")
public class CommonController {
    @RequestMapping(value = "getStringImg")
    public void getStringImg(@RequestParam(name = "url") String url, HttpServletResponse response) throws IOException {
//        BufferedImage image = null;
//        image = Img2String.image2txt(url);
//        if (image==null){
//            image = Img2String.image2txt("/mine/img/bg/bg1.jsp");
//        }
//        ImageIO.write(image, "JPEG", response.getOutputStream());
    }
    @RequestMapping(value = "img2String")
    public void img2String(HttpServletRequest request,HttpServletResponse response){
        List<MultipartFile> files = ((MultipartHttpServletRequest) request).getFiles("file");
        for (int i = 0; i < files.size(); i++) {
            MultipartFile file = files.get(i);
            String fileName = UpDownloadUtils.processImgUpLoad(file,request, response);
            Img2String img2String = new Img2String(request.getSession().getServletContext().getRealPath("")+File.separator+UpDownloadUtils.UPLOAD_PATH+File.separator+fileName);
            try {
                String text = img2String.image2txt();
                BufferedImage image = UtilsMethods.string2img(text);
                response.setHeader("content-disposition", "attachment;filename=" + URLEncoder.encode(fileName, "UTF-8"));
                OutputStream out =  response.getOutputStream();
                ImageIO.write(image, "jpg", out);
            } catch (IOException e) {
                e.printStackTrace();
            }
//            UpDownloadUtils.processImgDownload(fileName, request, response);
        }
    }
}
