package com.gyoomi.designpattern.strategy.demo01;

/**
 * 封装类
 *
 * @author Leon
 * @version 2019/4/1 21:53
 */
public class Context {

    private IStrategy iStrategy;

    public Context(IStrategy iStrategy) {
        this.iStrategy = iStrategy;
    }

    public void doAnything(){
        this.iStrategy.doSomething();
    }
}
