package com.wayne.controller;

import com.wayne.domain.BarCode;
import com.wayne.utils.BarCodeUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import java.io.File;


@Controller
@RequestMapping("/barCode")
public class BarCodeService {
    @RequestMapping("/testValidity")
    public String testValidity(HttpServletRequest request) {
        System.out.println("barCodes77:");
//        barCode.setBarCodeID(1234);
//        barCode.setColor("#FF0000");
//        barCode.setSize("XXL");

        String path = request.getSession().getServletContext().getRealPath("/hxwUploads/");
        File file = new File(path);
        if (!file.exists()) {
            file.mkdir();
        }

        BarCodeUtil.getBarCode("test3654645634",path+"abc.png");
        return "success";
    }

    @RequestMapping("/testAjax")
    public @ResponseBody BarCode testAjax(HttpServletRequest request, @RequestBody BarCode barCode) {
        System.out.println("barCodes190:" + barCode.getBarCodeID()+barCode.getColor()+barCode.getSize());


        String path = request.getSession().getServletContext().getRealPath("/hxwUploads/");
        File file = new File(path);
        if (!file.exists()) {
            file.mkdir();
        }



        String filePath = barCode.getBarCodeID()+barCode.getColor()+barCode.getSize()+".png";

        path = path + filePath;
//        /Applications/apache-tomcat-9.0.22/webapps/Sample200810_BarCode_war/hxwUploads/82793redXXL.png
        barCode.setImageUrl("/hxwUploads/"+filePath);

        BarCodeUtil.getBarCode(barCode.getBarCodeID()+barCode.getColor()+barCode.getSize(),path);



        return barCode;
    }

    @RequestMapping("/testBuildBarCode")
    public @ResponseBody BarCode testBuildBarCode(HttpServletRequest request, @RequestBody BarCode barCode) throws Exception {
        System.out.println("test testBuildBarCode");

        String path = request.getSession().getServletContext().getRealPath("/hxwUploads/");
        File file = new File(path);
        if (!file.exists()) {
            file.mkdir();
        }
        System.out.println("barCodes:" + barCode);
//        barCode.setBarCodeID(1234);
//        barCode.setColor("#FF0000");
//        barCode.setSize("XXL");
        return barCode;

    }
}

