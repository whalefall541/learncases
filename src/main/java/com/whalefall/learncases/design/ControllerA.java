package com.whalefall.learncases.design;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WhaleFall
 * @create 2022-07-24 6:37
 */
@RestController
@Slf4j
public class ControllerA {
    @Autowired
    private AService aService;

    @GetMapping("/testA")
    public boolean getA(){
       return aService.handle(e -> log.error(e.getMessage(), e));
    }
}
