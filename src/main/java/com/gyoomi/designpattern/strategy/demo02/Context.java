package com.gyoomi.designpattern.strategy.demo02;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2019/4/1 22:45
 */
public class Context {

    private Calculator  calculator;

    public Context(Calculator  calculator) {
        this.calculator = calculator;
    }

    public int exec(int a, int b) {
        return this.calculator.exec(a, b);
    }
}
