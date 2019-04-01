package com.gyoomi.designpattern.strategy.demo01;

/**
 * 具体策略角色-1
 *
 * @author Leon
 * @version 2019/4/1 21:51
 */
public class ConcreateStrategy01 implements IStrategy {

    @Override
    public void doSomething() {
        System.out.println("具体策略运算法则1");
    }
}
