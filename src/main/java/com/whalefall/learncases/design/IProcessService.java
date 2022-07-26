package com.whalefall.learncases.design;

import java.util.function.Consumer;

/**
 * @author WhaleFall
 * @create 2022-07-26 20:31
 */
public interface IProcessService {

    boolean handle(IService service, Consumer<Exception> exceptionConsumer);
}
