package com.gyoomi.designpattern.chain.demo01;

import com.gyoomi.designpattern.chain.demo01.support.Request;

/**
 * 场景类
 *
 * @author Leon
 * @version 2019/4/2 22:18
 */
public class Main {

    public static void main(String[] args) {
        // 1. 声明所有相关连
        Handler handler01 = new ConcreteHandler01();
        Handler handler02 = new ConcreteHandler02();
        Handler handler03 = new ConcreteHandler03();

        // 2. 设置连中的顺序1->2->3
        handler01.setNext(handler02);
        handler02.setNext(handler03);

        // 3. 提交结果，返回请求
        handler01.handleMessage(new Request());
    }
}
