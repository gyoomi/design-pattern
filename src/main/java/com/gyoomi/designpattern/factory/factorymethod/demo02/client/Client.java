/**
 * Copyright © 2018, LeonKeh
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.factory.factorymethod.demo02.factory.client;

import com.gyoomi.designpattern.factory.factorymethod.demo02.factory.dao.IUserDao;
import com.gyoomi.designpattern.factory.factorymethod.demo02.factory.IDaoFactory;
import com.gyoomi.designpattern.factory.factorymethod.demo02.factory.MySQLDaoFactory;
import com.gyoomi.designpattern.factory.factorymethod.demo02.factory.OracleDaoFactory;

/**
 * 测试类
 *
 * @author Leon
 * @version 2018/4/16 22:51
 */
public class Client {
    public static void main(String[] args) {
        IDaoFactory factory = new MySQLDaoFactory();
        IUserDao dao1 = factory.createUserDao();
        dao1.addUser();
        OracleDaoFactory factory2 = new OracleDaoFactory();
        IUserDao dao2 = factory2.createUserDao();
        dao2.addUser();
    }
}
