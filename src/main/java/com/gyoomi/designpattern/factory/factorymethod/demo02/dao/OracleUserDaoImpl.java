/**
 * Copyright © 2018, LeonKeh
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.factory.factorymethod.demo02.factory.dao;


import com.gyoomi.designpattern.factory.factorymethod.demo02.factory.bean.User;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/4/16 22:46
 */
public class OracleUserDaoImpl implements IUserDao {
    @Override
    public void addUser() {
        System.out.println("oracle add user...");
    }

    @Override
    public void deleteUser(String id) {
        System.out.println("oracle delete user...");
    }

    @Override
    public User getUser(String id) {
        User user = new User();
        user.setName("oracle");
        return user;
    }
}
