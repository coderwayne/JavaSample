package com.ofweek.util;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller

@RequestMapping("/uploadController")
public class UploadController {
    @RequestMapping("/testValidity")
    public void testValidity() {
        System.out.println("Test Validity");
    }

    @RequestMapping("/uploadAction")
    public void uploadVideo(Model model, @RequestParam("myFile") MultipartFile uploadFile, HttpServletRequest request) throws IllegalStateException, IOException {
        String path = request.getSession().getServletContext().getRealPath("/ofweekUpload/");

        File file = new File(path);

        if(!file.exists()) {
            file.mkdir();
        }

        String uuid = UUID.randomUUID().toString().replace("-", "");
        String fileName = uuid + uploadFile.getOriginalFilename();

        uploadFile.transferTo(new File(path, fileName));

    }
}
