/**
 * Copyright © 2018, TaoDing
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.factory.abstractfactory.demo01.factory;

import com.gyoomi.designpattern.factory.abstractfactory.demo01.bean.BMCar;
import com.gyoomi.designpattern.factory.abstractfactory.demo01.bean.Car;
import com.gyoomi.designpattern.factory.abstractfactory.demo01.bean.HLMoto;
import com.gyoomi.designpattern.factory.abstractfactory.demo01.bean.Moto;

/**
 * 进口摩托车工厂
 *
 * @author Leon
 * @version 2018/4/19 17:14
 */
public class JKFactory implements ToolFactory {
    @Override
    public Car getCarInstance() {
        return new BMCar();
    }

    @Override
    public Moto getMotoInstance() {
        return new HLMoto();
    }
}
