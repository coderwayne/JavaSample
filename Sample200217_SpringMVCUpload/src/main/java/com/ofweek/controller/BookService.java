package com.ofweek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
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
    public String uploadAction(HttpServletRequest request,@RequestParam MultipartFile hxwUpload) throws IOException {
        System.out.println(request+"," + hxwUpload);

        String path = request.getSession().getServletContext().getRealPath("/ofweekUpload/");

        File file = new File(path);

        if(!file.exists()) {
            file.mkdir();
        }

        String uuid = UUID.randomUUID().toString().replace("-", "");
        String fileName = uuid + hxwUpload.getOriginalFilename();

        hxwUpload.transferTo(new File(path, fileName));

        return "success";
    }
}
