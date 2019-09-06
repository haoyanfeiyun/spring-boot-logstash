package com.example.demo.controller;




import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("test")
@RestController
public class TestController {
    //    private static final Logger logger = LoggerFactory.getLogger(TestController.class);
//    private static final Logger LOGGER = LogManager.getLogger(TestController.class);

    private static final Logger LOGGER = LogManager.getLogger(TestController.class);
    @RequestMapping("test")
    public String test() {
        LOGGER.info("logstash log print");
        LOGGER.debug("nidaye");
        return "Hello World!!!";
    }
}
