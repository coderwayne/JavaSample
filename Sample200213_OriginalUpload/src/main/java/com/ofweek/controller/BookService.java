package com.ofweek.controller;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/book")
public class BookService {
    @RequestMapping("/testValidity")
    public String testValidity() {
        System.out.println("Test Validity");
        return "success";
    }

    @RequestMapping("/uploadAction")
    public String uploadAction(HttpServletRequest request) throws Exception {
        System.out.println("upload Action");

        String path = request.getSession().getServletContext().getRealPath("/hxwUploads/");
        File file = new File(path);
        if(!file.exists()) {
            file.mkdir();
        }

        //获取上传文件项
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);

        //解析request
        List<FileItem> items = upload.parseRequest(request);

        for(FileItem item:items) {
            if(item.isFormField()) {
                //普通form表单
            }
            else {
                String uuid = UUID.randomUUID().toString().replace("-", "");
                String fileName = uuid + "_" + item.getName();
                // 完成文件上传
                item.write(new File(path, fileName));
                // 删除临时文件
                item.delete();
            }
        }

        return "success";
    }
}
