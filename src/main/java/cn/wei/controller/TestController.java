package cn.wei.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.util.Date;

@RestController
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/testDateParam")
    public String dataParam(Date date, @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss") Date date1){
        System.out.println("参数传递:"+"date:"+date+"    date1(yyyy-MM-dd hh:mm:ss):"+date1);
        return "{'model':'我靠'}";
    }
}
