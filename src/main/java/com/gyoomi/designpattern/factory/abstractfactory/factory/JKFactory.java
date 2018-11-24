/**
 * Copyright © 2018, TaoDing
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.factory.abstractfactory.factory;

import com.gyoomi.designpattern.factory.abstractfactory.bean.BMCar;
import com.gyoomi.designpattern.factory.abstractfactory.bean.Car;
import com.gyoomi.designpattern.factory.abstractfactory.bean.HLMoto;
import com.gyoomi.designpattern.factory.abstractfactory.bean.Moto;

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
