/**
 * @(#)com.crimps.bulider.Nutritionfacts.java
 *
 * Copyright (c) 2014-2018 厦门民航凯亚有限公司
 *
 */
package com.crimps.bulider;

/**
 * @author crimps
 * @version 1.0  16/7/26
 * @modified crimps  16/7/26  <创建>
 */
public class Nutritionfacts {
    private final int num1;
    private final int num2;
    private final int num3;
    private final int num4;
    private final int num5;
    private final int num6;

    public static class Builder {
        //必需的参数
        private final int num1;
        private final int num2;
        //非必需的参数
        private int num3 = 0;
        private int num4 = 0;
        private int num5 = 0;
        private int num6 = 0;

        public Builder(int num1, int num2) {
            this.num1 = num1;
            this.num2 = num2;
        }

        public Builder num3(int num3) {
            this.num3 = num3;
            return this;
        }

        public Builder num4(int num4) {
            this.num4 = num4;
            return this;
        }

        public Builder num5(int num5) {
            this.num5 = num5;
            return this;
        }

        public Builder num6(int num6) {
            this.num6 = num6;
            return this;
        }

        public Nutritionfacts build() {
            return new Nutritionfacts(this);
        }
    }

    public Nutritionfacts(Builder builder) {
        num1 = builder.num1;
        num2 = builder.num2;
        num3 = builder.num3;
        num4 = builder.num4;
        num5 = builder.num5;
        num6 = builder.num6;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public int getNum3() {
        return num3;
    }

    public int getNum4() {
        return num4;
    }

    public int getNum5() {
        return num5;
    }

    public int getNum6() {
        return num6;
    }
}