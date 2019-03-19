package com.gupao.vip.edu.factory.abstr;

/**
 * #ClassName AbstractFactoryTest
 * #Description TODO
 * #Date 2019/3/19 23:49
 * #Version 1.0
 **/
public class AbstractFactoryTest {
    public static void main(String[] args) {
        MilkFactory milkFactory = new MilkFactory();
        String name = milkFactory.getTeLunSu().getName();
        System.out.println(name);
    }
}
