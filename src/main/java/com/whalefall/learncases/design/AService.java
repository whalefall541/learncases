package com.whalefall.learncases.design;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author WhaleFall
 * @create 2022-07-24 6:34
 */
@Slf4j
@Component
public class AService implements IService {
    @Override
    public boolean doService() {
        log.info("do A service");
        if (true)
            throw new RuntimeException("Exception msg1");
        return true;
    }

    @Override
    public void doLog() {
        if (true)
            throw new RuntimeException("Exception msg2");
        log.error("A1 do log");
    }
}
