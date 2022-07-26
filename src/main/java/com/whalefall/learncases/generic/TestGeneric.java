package com.whalefall.learncases.generic;

import com.whalefall.learncases.override.Father;
import com.whalefall.learncases.override.Son;

/**
 * @author WhaleFall
 * @create 2022-07-26 20:13
 */
public class TestGeneric {
    public static void main(String[] args) {
        // 泛型接口
        Impl i = new Impl();
        Son instance = i.getInstance(new Father());
        System.out.println("instance = " + instance);

        // 泛型类
        A<String> a = new A<>();
        a.test("123");
        // 泛型方法
        a.doLog(100);

    }
}
