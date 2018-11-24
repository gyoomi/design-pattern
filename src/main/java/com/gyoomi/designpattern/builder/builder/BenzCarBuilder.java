/**
 * Copyright © 2018, LeonKeh
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.builder.builder;

import com.gyoomi.designpattern.builder.model.BenzCarModel;
import com.gyoomi.designpattern.builder.model.CarModel;

import java.util.List;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/11/24 23:40
 */
public class BenzCarBuilder extends CarBuilder {

    private BenzCarModel benzCarModel = new BenzCarModel();

    @Override
    public void setSequence(List<String> sequence) {
        this.benzCarModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benzCarModel;
    }
}
