package com.gyoomi.designpattern.strategy.demo02;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2019/4/1 22:47
 */
public class Main {

    public static void main(String[] args) {
        int a = 10, b = 21;
        SubCalculator sub = new SubCalculator();
        Context ctx = new Context(sub);
        int exec = ctx.exec(a, b);
        System.out.println(exec);
    }
}
