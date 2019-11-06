package com.gyoomi.designpattern.flyweight.demo01;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2019/11/6 21:11
 */
public abstract class FlyWeight {

    /**
     * 内部状态
     */
    private String intrinsic;

    /**
     * 外部状态
     * <p>{@code final}</p>
     */
    protected final String extrinsic;

    public FlyWeight(String extrinsic) {
        this.extrinsic = extrinsic;
    }

    /**
     * 定义业务操作
     */
    public abstract void operate();


    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }
}
