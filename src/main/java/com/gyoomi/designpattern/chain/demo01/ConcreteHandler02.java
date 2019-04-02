package com.gyoomi.designpattern.chain.demo01;

import com.gyoomi.designpattern.chain.demo01.support.Level;
import com.gyoomi.designpattern.chain.demo01.support.Request;
import com.gyoomi.designpattern.chain.demo01.support.Response;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2019/4/2 22:17
 */
public class ConcreteHandler02 extends Handler {

    @Override
    protected Level getHandlerLevel() {
        return null;
    }

    @Override
    protected Response echo(Request request) {
        return null;
    }
}
