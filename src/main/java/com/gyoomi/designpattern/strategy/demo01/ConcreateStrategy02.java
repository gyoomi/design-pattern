package com.gyoomi.designpattern.strategy.demo01;

/**
 * 具体策略角色-2
 *
 * @author Leon
 * @version 2019/4/1 21:52
 */
public class ConcreateStrategy02 implements IStrategy {

    @Override
    public void doSomething() {
        System.out.println("具体策略角色2");
    }
}
