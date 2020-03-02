package com.ofweek.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String s) {
        if(s == null) {
            throw new RuntimeException("请传入时间字符串");
        }

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM/dd");

        try {
            return dateFormat.parse(s);
        } catch (Exception ex) {
            throw new RuntimeException("转换出错");
        }
    }
}
