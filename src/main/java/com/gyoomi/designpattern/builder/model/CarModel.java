/**
 * Copyright © 2018, LeonKeh
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.builder.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/11/24 18:50
 */
public abstract class CarModel {

    private List<String> sequence = new ArrayList<>();

    protected abstract void start();

    protected abstract void alarm();

    protected abstract void engineBoom();

    protected abstract void stop();

    public final void run() {
        sequence.forEach(s -> {
            if ("start".equals(s)) {
                this.start();
            } else if ("alarm".equals(s)) {
                this.alarm();
            } else if ("engineBoom".equals(s)) {
                this.engineBoom();
            } else if ("stop".equals(s)){
                this.stop();
            }
        });
    }

    public void setSequence(List<String> sequence) {
        this.sequence = sequence;
    }
}
