package com.example.demo;

import lombok.extern.flogger.Flogger;
import org.slf4j.Logger;
//import org.junit.platform.commons.logging.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {

     Logger logger = LoggerFactory.getLogger(hello.class);

    @GetMapping("/hello")
    public String rethello(){
        logger.error("FATAL ERROR");
         return "hello";
    }
}
