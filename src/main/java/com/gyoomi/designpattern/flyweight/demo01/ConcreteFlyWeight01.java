package com.gyoomi.designpattern.flyweight.demo01;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2019/11/6 21:16
 */
public class ConcreteFlyWeight01 extends FlyWeight {

    /**
     * 接受外部状态
     * @param extrinsic 外部状态
     */
    public ConcreteFlyWeight01(String extrinsic) {
        super(extrinsic);
    }

    /**
     * 根据外部状态进行逻辑处理
     */
    @Override
    public void operate() {
        System.out.println("业务处理1...");
    }

}
