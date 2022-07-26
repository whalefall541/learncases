package com.whalefall.learncases.design;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WhaleFall
 * @create 2022-07-24 6:37
 */
@RestController
@Slf4j
public class ControllerA {

    private IService service;

    private IProcessService processService;

    public ControllerA(IService service, ProcessService processService) {
        this.service = service;
        this.processService = processService;
    }

    @GetMapping("/testA")
    public boolean getA(){
       return processService.handle(service, e -> log.error(e.getMessage(), e));
    }
}
