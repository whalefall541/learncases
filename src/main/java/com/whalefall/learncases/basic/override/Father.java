package com.whalefall.learncases.basic.override;

/**
 * @author WhaleFall
 * @create 2022-06-29 21:54
 */
public class Father {
    public final void work() {
        System.out.println("father work");
    }

    /**
     * 重载final方法
     * @param s 入参
     */
    public final void work(String s) {
        System.out.println("son work");
    }

    public static void work1() {
        System.out.println("father work");
    }

    /**
     * 重载static方法
     * @param s 入参
     */
    public static void work1(String s) {
        System.out.println("son work");
    }

    public void print(final String s) {
        System.out.println("father print");
    }
}
