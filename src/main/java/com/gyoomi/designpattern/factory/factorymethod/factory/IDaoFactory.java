/**
 * Copyright © 2018, LeonKeh
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.factory.factorymethod.factory;

import com.gyoomi.designpattern.factory.factorymethod.dao.IUserDao;

/**
 * 抽象工厂
 *
 * @author Leon
 * @version 2018/4/16 22:49
 */
public interface IDaoFactory {

    IUserDao createUserDao();
}
