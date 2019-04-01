package com.gyoomi.designpattern.strategy.demo02;

/**
 * 加法运算
 *
 * @author Leon
 * @version 2019/4/1 22:38
 */
public class AddCalculator implements Calculator {

    @Override
    public int exec(int a, int b) {
        return a + b;
    }
}
