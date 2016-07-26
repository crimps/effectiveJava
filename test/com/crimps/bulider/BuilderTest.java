package com.crimps.bulider;


import org.junit.Test;

public class BuilderTest {

    @Test
    public void test() {
        Nutritionfacts nutritionfacts = new Nutritionfacts.Builder(1, 2).num3(3).num4(4).num5(5).num6(6).build();
        System.out.println(nutritionfacts.getNum1());
        System.out.println(nutritionfacts.getNum2());
        System.out.println(nutritionfacts.getNum3());
        System.out.println(nutritionfacts.getNum4());
        System.out.println(nutritionfacts.getNum5());
        System.out.println(nutritionfacts.getNum6());
    }
}