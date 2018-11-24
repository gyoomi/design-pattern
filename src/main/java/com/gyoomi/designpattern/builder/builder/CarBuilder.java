/**
 * Copyright © 2018, LeonKeh
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.builder.builder;

import com.gyoomi.designpattern.builder.model.CarModel;

import java.util.List;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/11/24 23:38
 */
public abstract class CarBuilder {

    public abstract void setSequence(List<String> sequence);

    public abstract CarModel getCarModel();
}
