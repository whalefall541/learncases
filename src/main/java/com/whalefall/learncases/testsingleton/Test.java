package com.whalefall.learncases.testsingleton;

/**
 * @author WhaleFall
 * @create 2022-07-27 22:21
 */
public class Test {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getSingleton();
        instance1.put("a", "1");
        Singleton instance2 = Singleton.getSingleton();
        instance2.put("b", "2");

        // 单例对象 因为只实例化一次 所以对象内部的 非static变量 也会只有一份。
        instance1.getMap().forEach((k, v) -> System.out.println(k + " @ " + v));
        System.out.println("----------------dash----------------");
        instance2.getMap().forEach((k, v) -> System.out.println(k + " @ " + v));
        System.out.println("----------------dash----------------");

        Singleton newSingleton = Singleton.getNewSingleton();
        newSingleton.put("a", "1");
        Singleton newSingleton1 = Singleton.getNewSingleton();
        newSingleton1.put("c", "3");

        newSingleton.getMap().forEach((k, v) -> System.out.println(k + " @ " + v));
        System.out.println("----------------dash----------------");
        newSingleton1.getMap().forEach((k, v) -> System.out.println(k + " @ " + v));

        /*
        output:
                a @ 1
                b @ 2
                ----------------dash----------------
                a @ 1
                b @ 2
                ----------------dash----------------
                a @ 1
                ----------------dash----------------
                c @ 3
         */

    }
}
