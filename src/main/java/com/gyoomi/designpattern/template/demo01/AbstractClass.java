/**
 * Copyright © 2019, LeonKeh
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.template.demo01;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2019/4/2 14:06
 */
public abstract class AbstractClass {

    /**
     * 基本方法
     */
    protected abstract void doSomething();

    /**
     * 基本方法
     */
    protected abstract void doAnything();

    /**
     * 模板方法
     */
    public final void templateMethod() {
        this.doSomething();
        this.doAnything();
    }
}
