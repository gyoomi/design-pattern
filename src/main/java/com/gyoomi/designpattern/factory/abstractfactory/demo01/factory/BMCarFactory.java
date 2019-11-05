/**
 * Copyright © 2018, TaoDing
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.factory.abstractfactory.demo01.factory;

import com.gyoomi.designpattern.factory.abstractfactory.demo01.bean.BMCar;
import com.gyoomi.designpattern.factory.abstractfactory.demo01.bean.Car;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/4/19 16:55
 */
@Deprecated
public class BMCarFactory implements ICarFactory {
    @Override
    public Car createCarInstance() {
        return new BMCar();
    }
}
