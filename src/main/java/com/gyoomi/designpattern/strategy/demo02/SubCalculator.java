package com.gyoomi.designpattern.strategy.demo02;

/**
 * 减法运算
 *
 * @author Leon
 * @version 2019/4/1 22:39
 */
public class SubCalculator implements Calculator {

    @Override
    public int exec(int a, int b) {
        return a - b;
    }
}
