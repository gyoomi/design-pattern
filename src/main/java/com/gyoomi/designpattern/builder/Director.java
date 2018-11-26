/**
 * Copyright © 2018, TaoDing
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.builder;

import com.gyoomi.designpattern.builder.builder.BWMModelBuilder;
import com.gyoomi.designpattern.builder.builder.BenzCarBuilder;
import com.gyoomi.designpattern.builder.model.BWMModel;
import com.gyoomi.designpattern.builder.model.BenzCarModel;

import java.util.ArrayList;
import java.util.List;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/11/26 9:58
 */
public class Director {
    private List<String> sequence = new ArrayList<>();
    private BenzCarBuilder benzCarBuilder = new BenzCarBuilder();
    private BWMModelBuilder bwmModelBuilder = new BWMModelBuilder();

    public BenzCarModel getABenzCarModel() {
        this.sequence.clear();
        this.sequence.add("engineBoom");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzCarBuilder.setSequence(this.sequence);
        return (BenzCarModel) benzCarBuilder.getCarModel();
    }

    public BenzCarModel getBBenzCarModel() {
        this.sequence.clear();
        this.sequence.add("alarm");
        this.sequence.add("engineBoom");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzCarBuilder.setSequence(this.sequence);
        return (BenzCarModel) benzCarBuilder.getCarModel();
    }

    public BWMModel getCBWMModel() {
        this.sequence.clear();
        this.sequence.add("alarm");
        this.sequence.add("start");
        this.sequence.add("stop");
        bwmModelBuilder.setSequence(this.sequence);
        return (BWMModel) bwmModelBuilder.getCarModel();
    }

    public BWMModel getDBWMModel() {
        this.sequence.clear();
        this.sequence.add("start");
        bwmModelBuilder.setSequence(this.sequence);
        return (BWMModel) bwmModelBuilder.getCarModel();
    }


}
