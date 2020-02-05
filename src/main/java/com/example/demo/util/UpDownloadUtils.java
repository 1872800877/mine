package com.example.demo.util;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.UUID;

public class UpDownloadUtils {
    public static final String UPLOAD_PATH = "static/img/upload";

    public static String processImgUpLoad(MultipartFile file,HttpServletRequest request, HttpServletResponse response){
        //得到上传文件的保存目录，将上传的文件存放于WEB-INF目录下，不允许外界直接访问，保证上传文件的安全
        String savePath = request.getSession().getServletContext().getRealPath("")+File.separator+UPLOAD_PATH;
        File newFile = new File(savePath);
        if(!newFile.exists()&&!newFile.isDirectory()){
            System.out.println("目录或文件不存在！");
            newFile.mkdir();
        }
        //消息提示
        String message = "";
        //如果fileitem中封装的是上传文件，得到上传的文件名称，
        String fileName = file.getOriginalFilename();
        System.out.println(fileName);
        if(fileName==null||fileName.trim().equals("")){
            return null;
        }
        //注意：不同的浏览器提交的文件名是不一样的，有些浏览器提交上来的文件名是带有路径的，如：  c:\a\b\1.txt，而有些只是单纯的文件名，如：1.txt
        //处理获取到的上传文件的文件名的路径部分，只保留文件名部分
        fileName = fileName.substring(fileName.lastIndexOf(File.separator)+1);
        //得到上传文件的扩展名
        String fileExtName = fileName.substring(fileName.lastIndexOf(".")+1);
        if(!"jpg".equalsIgnoreCase(fileExtName)&&!"png".equalsIgnoreCase(fileExtName)){
            return null;
        }
        //如果需要限制上传的文件类型，那么可以通过文件的扩展名来判断上传的文件类型是否合法
        System.out.println("上传文件的扩展名为:"+fileExtName);
        //得到文件保存的名称
        fileName = mkFileName(fileName);
        //得到文件保存的路径
//        String savePathStr = mkFilePath(savePath, fileName);
        System.out.println("保存路径为:"+savePath);
        //创建一个文件输出流
        if (file.isEmpty()) {
            return null;
        }
        File dest = new File(savePath+File.separator+fileName);
        try {
            file.transferTo(dest);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return fileName;
    }
    public static void processImgDownload(String fileName, HttpServletRequest request, HttpServletResponse response){
        try {
            fileName = new String(fileName.getBytes("UTF-8"),"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        //上传的文件都是保存在/WEB-INF/upload目录下的子目录当中
        String fileSaveRootPath=request.getSession().getServletContext().getRealPath("")+File.separator+UPLOAD_PATH;
        // 处理文件名
        String realname = fileName.substring(fileName.indexOf("_")+1);
        //得到要下载的文件
        File file = new File(fileSaveRootPath+File.separator+fileName);
        //如果文件不存在
        if(!file.exists()){
            System.out.println("文件不存在");
            return;
        }
        //设置响应头，控制浏览器下载该文件
        try {
            response.setHeader("content-disposition", "attachment;filename=" + URLEncoder.encode(realname, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        //读取要下载的文件，保存到文件输入流
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            //创建输出流
            OutputStream fos = response.getOutputStream();
            //创建一个缓冲区
            byte[] buff = new byte[1024];
            //判断输入流中的数据是否已经读完的标识
            int length = 0;
            int i = fis.read(buff);
            while (i != -1) {
                fos.write(buff, 0, buff.length);
                fos.flush();
                i = fis.read(buff);
            }
            //关闭输入流
            fis.close();
            //关闭输出流
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //生成上传文件的文件名，文件名以：uuid+"_"+文件的原始名称
    private static String mkFileName(String fileName){
        return UUID.randomUUID().toString()+"_"+fileName;
    }

    private static String mkFilePath(String savePath,String fileName){
        //得到文件名的hashCode的值，得到的就是filename这个字符串对象在内存中的地址
        int hashcode = fileName.hashCode();
        int dir1 = hashcode&0xf;
        int dir2 = (hashcode&0xf0)>>4;
        //构造新的保存目录
        String dir = savePath + "\\" + dir1 + "\\" + dir2;
        //File既可以代表文件也可以代表目录
        File file = new File(dir);
        if(!file.exists()){
            file.mkdirs();
        }
        return dir;
    }
}
