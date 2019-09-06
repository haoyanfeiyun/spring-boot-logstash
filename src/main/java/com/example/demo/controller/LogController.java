package com.example.demo.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/test")
public class LogController {

    private Logger logger = LogManager.getLogger(LogController.class);
    
    @RequestMapping(value = "/log4j2", method = RequestMethod.GET)
    public String testLog(){
        try {
            logger.info("Hello 这是 info message. 信息");
            logger.error("Hello 这是 error message. 报警");
            logger.warn("Hello 这是 warn message. 警告");
            logger.debug("Hello 这是 debug message. 调试");
            logger.fatal("Hello 这是 fatal message. 严重");
            List<String> list = new ArrayList<>();
            System.out.println(list.get(2));
        } catch (Exception e) {
            logger.error("testLog", e);
        }
        return "";
    }
}
