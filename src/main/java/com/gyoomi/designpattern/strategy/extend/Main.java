package com.gyoomi.designpattern.strategy.extend;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2019/4/1 23:10
 */
public class Main {

    public static void main(String[] args) {
        CalculatorEnum add = CalculatorEnum.ADD;
        int exec = add.exec(10, 20);
        System.out.println(exec);

        CalculatorEnum sub = CalculatorEnum.SUB;
        int s = sub.exec(10, 20);
        System.out.println(s);
    }
}
