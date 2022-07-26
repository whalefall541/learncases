package com.whalefall.learncases.generic;

import com.whalefall.learncases.override.Father;
import com.whalefall.learncases.override.Son;
import lombok.extern.slf4j.Slf4j;

import java.util.Collection;

/**
 * @author WhaleFall
 * @create 2022-07-26 20:05
 */
@Slf4j
public class A<T> {
    public void test(T t) {
        System.out.println(t);
    }

    public <E extends Number> void doLog(E e) {
        log.error(this.getClass() + " : " + String.valueOf(e));
    }

    public void testExtends(Collection<? extends Father> c){

//        c.add(new Father());
//        c.add(new Son());
    }

    // ? 通配 会使类型失去写的能力，只能使用与类型无关的读取动作
    public void testExtends1(Collection<? super Son> c){

//        c.add(new Father());
        c.add(new Son());
    }

    public void testWild(Collection<?> c) {
//        c.add(1);
//        c.add(2);
        c.size();
    }

    public <F> void testWild1(Collection<F> c) {
        c.add((F)new Integer(1));
        c.add((F)"1231");
    }
}
