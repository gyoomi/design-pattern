/**
 * Copyright © 2018, LeonKeh
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.adapter.demo01.adaptee;

import java.util.Map;

/**
 * 被适配者接口
 *
 * @author Leon
 * @version 2018/12/12 14:54
 */
public interface IOuterUser {

    Map getUserBaseInfo();

    Map getUserOfficeInfo();

    Map getUserHomeInfo();
}
