/**
 * Copyright © 2019, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.factory.factorymethod.demo01;

/**
 * The description of class
 *
 * @author Leon
 * @date 2019-11-04 14:06
 */
public abstract class Factory {

    /**
     * 创建一个产品对象， 其输入参数类型可以自行设置
     * <p>通常为String、 Enum、 Class等， 当然也可以为空</p>
     *
     * @param clazz
     * @param <T>
     * @return
     */
    public abstract <T extends Product> T getProduct(Class<T> clazz);
}
