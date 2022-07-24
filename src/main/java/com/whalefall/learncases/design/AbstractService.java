package com.whalefall.learncases.design;

import lombok.extern.slf4j.Slf4j;

import java.util.function.Consumer;

/**
 * @author WhaleFall
 * @create 2022-07-24 6:26
 */
@Slf4j
public abstract class AbstractService {
    protected abstract boolean doService();

    protected void doLog() {

    }

    public boolean handle(Consumer<Exception> exceptionConsumer) {
        try {
            doService();
        } catch (Exception e1) {
            exceptionConsumer.accept(e1);
            try {
                doLog();
            } catch (Exception e2) {
                log.error("failed business and do log ");
                exceptionConsumer.accept(e2);
            }
            return false;
        }

        try {
            doLog();
        } catch (Exception e2) {
            log.error("failed do log");
            exceptionConsumer.accept(e2);
        }

        return true;
    }

}
