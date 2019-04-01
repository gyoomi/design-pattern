package com.gyoomi.designpattern.strategy.demo01;

/**
 * 高层调用模块
 *
 * @author Leon
 * @version 2019/4/1 21:54
 */
public class Main {

    public static void main(String[] args) {
        IStrategy iStrategy = new ConcreateStrategy02();
        Context ctx = new Context(iStrategy);
        ctx.doAnything();
    }
}
