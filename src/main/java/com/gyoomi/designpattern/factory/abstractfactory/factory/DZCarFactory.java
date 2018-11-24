/**
 * Copyright © 2018, TaoDing
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.factory.abstractfactory.factory;

import com.gyoomi.designpattern.factory.abstractfactory.bean.Car;
import com.gyoomi.designpattern.factory.abstractfactory.bean.DZCar;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/4/19 16:56
 */
@Deprecated
public class DZCarFactory implements ICarFactory {
    @Override
    public Car createCarInstance() {
        return new DZCar();
    }
}
