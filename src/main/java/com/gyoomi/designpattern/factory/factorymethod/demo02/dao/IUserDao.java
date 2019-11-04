/**
 * Copyright © 2018, LeonKeh
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.designpattern.factory.factorymethod.demo02.factory.dao;


import com.gyoomi.designpattern.factory.factorymethod.demo02.factory.bean.User;

/**
 * IUserDao Interface
 *
 * @author Leon
 * @version 2018/4/16 22:42
 */
public interface IUserDao {

    void addUser();

    void deleteUser(String id);

    User getUser(String id);
}
