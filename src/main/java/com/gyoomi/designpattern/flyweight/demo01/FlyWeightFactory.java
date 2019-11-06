package com.gyoomi.designpattern.flyweight.demo01;

import java.util.HashMap;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2019/11/6 21:19
 */
public class FlyWeightFactory {

    /**
     * 池容器
     */
    private static HashMap<String, FlyWeight> pool = new HashMap<>(32);

    /**
     * 享元模式工厂
     * @param extrinsic key
     * @return 享元对象
     */
    public static FlyWeight getFlyWeight(String extrinsic) {
        FlyWeight flyWeight = null;
        if (pool.containsKey(extrinsic)) {
            flyWeight = pool.get(extrinsic);
        } else {
            flyWeight = new ConcreteFlyWeight01(extrinsic);
            pool.put(extrinsic, flyWeight);
        }
        return flyWeight;
    }
}
