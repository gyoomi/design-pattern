/**
 * Copyright © 2018, LeonKeh
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.builder.builder;

import com.gyoomi.designpattern.builder.model.BWMModel;
import com.gyoomi.designpattern.builder.model.CarModel;

import java.util.List;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/11/24 23:41
 */
public class BWMModelBuilder extends CarBuilder {

    private BWMModel bwmModel = new BWMModel();

    @Override
    public void setSequence(List<String> sequence) {
        this.bwmModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.bwmModel;
    }
}
