/**
 * Copyright © 2018, TaoDing
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.factory.abstractfactory.demo01.factory;

import com.gyoomi.designpattern.factory.abstractfactory.demo01.bean.Car;

/**
 * 汽车工厂
 *
 * @author Leon
 * @version 2018/4/19 16:54
 */
@Deprecated
public interface ICarFactory {
    public Car createCarInstance();
}
