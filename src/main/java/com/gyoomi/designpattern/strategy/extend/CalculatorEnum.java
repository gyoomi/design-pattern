package com.gyoomi.designpattern.strategy.extend;


/**
 * 类功能描述
 *
 * @author Leon
 * @version 2019/4/1 22:51
 */
public enum CalculatorEnum {

    ADD("+") {
        public int exec(int a, int b) {
            return a + b;
        }
    },

    SUB("-") {
        public int exec(int a, int b) {
            return a - b;
        }
    };

    private String value;

    CalculatorEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public abstract int exec(int a, int b);
}
