package com.whalefall.learncases.design;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import java.util.function.Consumer;

/**
 * @author WhaleFall
 * @create 2022-07-24 6:26
 */
@Component
@Slf4j
public class ProcessService implements IProcessService{

    public boolean handle(IService service, Consumer<Exception> exceptionConsumer) {
        serviceBefore(service);
        service(service, exceptionConsumer);
        serviceAfter(service);
        log(service, exceptionConsumer);
        return true;
    }

    private void serviceAfter(@NotNull IService service) {
        service.doServiceAfter();
    }

    private void serviceBefore(@NotNull IService service) {
        service.doServiceBefore();
        log.error("service before result " + service.doServiceBefore());

    }

    private void service(@NotNull IService service, Consumer<Exception> exceptionConsumer) {
        try {
            service.doService();
        } catch (Exception e1) {
            exceptionConsumer.accept(e1);
            throw e1;
        }
    }

    private void log(@NotNull IService service, Consumer<Exception> exceptionConsumer) {
        try {
            service.doLog();
        } catch (Exception e2) {
            log.error("failed do log");
            exceptionConsumer.accept(e2);
        }
    }
}
