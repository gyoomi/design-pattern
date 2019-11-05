/**
 * Copyright © 2018, TaoDing
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.factory.abstractfactory.demo01.factory;

import com.gyoomi.designpattern.factory.abstractfactory.demo01.bean.Car;
import com.gyoomi.designpattern.factory.abstractfactory.demo01.bean.DZCar;
import com.gyoomi.designpattern.factory.abstractfactory.demo01.bean.JLMoto;
import com.gyoomi.designpattern.factory.abstractfactory.demo01.bean.Moto;

/**
 * 国产摩托车工厂
 *
 * @author Leon
 * @version 2018/4/19 17:12
 */
public class GCFactory implements ToolFactory {
    @Override
    public Car getCarInstance() {
        return new DZCar();
    }

    @Override
    public Moto getMotoInstance() {
        return new JLMoto();
    }
}
