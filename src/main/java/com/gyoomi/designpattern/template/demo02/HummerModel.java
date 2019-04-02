/**
 * Copyright © 2019, LeonKeh
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.template.demo02;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2019/4/2 16:22
 */
public abstract class HummerModel {

    protected boolean alarm = true;

    protected abstract void start();

    protected abstract void alarm();

    protected abstract void engineBoom();

    protected abstract void stop();

    public final void run() {
        this.start();
        if (isAlarm()) {
            this.alarm();
        }
        this.engineBoom();
        this.stop();
    }

    public boolean isAlarm() {
        return alarm;
    }

    /**
     * 被称为钩子函数
     *
     * @param alarm
     */
    public void setAlarm(boolean alarm) {
        this.alarm = alarm;
    }
}
