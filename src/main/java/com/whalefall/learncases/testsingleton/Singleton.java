package com.whalefall.learncases.testsingleton;

import java.util.HashMap;

/**
 * @author WhaleFall
 * @create 2022-07-27 22:15
 */
public class Singleton {
    @SuppressWarnings({"rawtypes", "unchecked"})
    private final HashMap<String, String> map = new HashMap();

    public HashMap<String, String> getMap() {
        return map;
    }

    private static class Holder {
        public static final Singleton INSTANCE =  new Singleton();
    }

    public static Singleton getSingleton() {
        return Holder.INSTANCE;
    }

    public static Singleton getNewSingleton() {
        return new Singleton();
    }

    public void put(String k, String v) {
        map.put(k, v);
    }

}
