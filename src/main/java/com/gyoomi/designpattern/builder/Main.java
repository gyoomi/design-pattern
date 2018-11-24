/**
 * Copyright © 2018, LeonKeh
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.builder;

import com.gyoomi.designpattern.builder.builder.BWMModelBuilder;
import com.gyoomi.designpattern.builder.builder.BenzCarBuilder;
import com.gyoomi.designpattern.builder.model.BWMModel;
import com.gyoomi.designpattern.builder.model.BenzCarModel;

import java.util.Arrays;
import java.util.List;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/11/24 23:27
 */
public class Main {

    public static void main(String[] args) {
        List<String> sequ = Arrays.asList("engineBoom", "start", "stop");
        BenzCarBuilder benzCarBuilder = new BenzCarBuilder();
        benzCarBuilder.setSequence(sequ);
        BenzCarModel benzCarModel = (BenzCarModel) benzCarBuilder.getCarModel();
        benzCarModel.run();
        BWMModelBuilder bwmModelBuilder = new BWMModelBuilder();
        bwmModelBuilder.setSequence(sequ);
        BWMModel bwmModel = (BWMModel) bwmModelBuilder.getCarModel();
        bwmModel.run();
    }
}
