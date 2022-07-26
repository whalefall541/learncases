package com.whalefall.learncases.override;

/**
 * @author WhaleFall
 * @create 2022-06-29 21:54
 */
public class Son extends Father {
//    @Override
//    public final void work() {
//        System.out.println("son work");
//    }

    /**
     * 隐藏父类static方法
     */
    public static void work1() {
        System.out.println("son work");
    }

    /**
     * 只有实例方法可以被重写 静态的成员变量 静态方法只能被隐藏；
     * <p>
     * 重写: 两同两小一大
     * 方法名相同 方法参数类型相同
     * 子类返回类型小于父类返回类型
     * 子类抛出异常小于父类异常
     * 子类访问权限大于父类
     * 注意点
     * 1. 重写方法可以改变其他 修饰符 如 synchronized final native
     * 2. 不管方法参数中有无final修饰，重写方法可以任意处理参数修饰符
     */
    @Override
    public synchronized final void print(String s) {
        System.out.println("son print");
    }

}
