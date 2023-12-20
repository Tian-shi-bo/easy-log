package com.easy.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

/**
 * @author t1tan
 */
@RestController
@RequestMapping("/easy/log")
public class IndexController {

    private final static Logger logger= LoggerFactory.getLogger(IndexController.class);

    @RequestMapping("/myTestInfo")
    public void myTestInfo(){
        logger.info("日志开始"+System.currentTimeMillis());
        logger.info("日志结束"+System.currentTimeMillis());
    }
    @RequestMapping("/myTestError")
    public void myTestError() throws Exception {
        logger.error("错误日志"+System.currentTimeMillis());
        throw new Exception("错误日志");
    }

}
