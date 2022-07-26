package com.whalefall.learncases.generic;

/**
 * @author WhaleFall
 * @create 2022-07-26 20:06
 */
public interface I <E, T extends E>{
    T getInstance(E e);
}
