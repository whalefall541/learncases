package com.whalefall.learncases.generic;

import com.whalefall.learncases.override.Father;
import com.whalefall.learncases.override.Son;

import java.util.HashMap;

/**
 * @author WhaleFall
 * @create 2022-07-26 20:13
 */
@SuppressWarnings({"unchecked"})
public class TestGeneric {
    private static final HashMap<String, Object> stringObjMap = new HashMap<>();

    public static <T> T getObject(String k) {
        return (T) stringObjMap.get(k);
    }

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

        stringObjMap.put("father", new Father());
        System.out.println("father = " + getObject("father"));
    }
}
