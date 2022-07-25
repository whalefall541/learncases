package com.whalefall.learncases.design;

/**
 * @author WhaleFall
 * @create 2022-07-25 19:21
 */
public interface IService {
    boolean doService();

    boolean doServiceBefore();

    boolean doServiceAfter();

    void doLog();
}
