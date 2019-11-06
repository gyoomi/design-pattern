package com.gyoomi.designpattern.flyweight.demo01;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2019/11/6 21:24
 */
public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            String extrinsic = "key " + i;
            FlyWeight flyWeight = FlyWeightFactory.getFlyWeight(extrinsic);
            System.out.println(flyWeight);
        }
    }
}
