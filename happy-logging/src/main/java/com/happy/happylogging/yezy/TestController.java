package com.happy.happylogging.yezy;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestController {
//    private static final Logger log = LoggerFactory.getLogger(TestController.class);

    @Autowired
    @Qualifier("dcn")
    private String driverClassName;

    @GetMapping("/profile")
    public void profile() {
        log.info(driverClassName);
    }

    @GetMapping("/log")
    public void logTest() {
        log.trace("A TRACE Message");
        log.debug("A DEBUG Message");
        log.info("A INFO Message");
        log.warn("A WARN Message");
        log.error("A ERROR Message");
    }
}