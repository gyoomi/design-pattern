/**
 * Copyright © 2018, LeonKeh
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.factory.factorymethod.demo02.factory;

import com.gyoomi.designpattern.factory.factorymethod.demo02.factory.dao.IUserDao;
import com.gyoomi.designpattern.factory.factorymethod.demo02.factory.dao.OracleUserDaoImpl;

/**
 * OracleDaoFactory
 *
 * @author Leon
 * @version 2018/4/16 22:50
 */
public class OracleDaoFactory implements IDaoFactory {
    @Override
    public IUserDao createUserDao() {
        return new OracleUserDaoImpl();
    }
}
