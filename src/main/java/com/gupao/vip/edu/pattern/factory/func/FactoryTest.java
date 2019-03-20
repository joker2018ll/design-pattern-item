package com.gupao.vip.edu.pattern.factory.func;

/**
 * #ClassName FactoryTest
 * #Description TODO
 * #Date 2019/3/19 23:39
 * #Version 1.0
 **/
public class FactoryTest {
    public static void main(String[] args) {
        Factory factory = new MenNiuFactory();
        String name = factory.getMilk().getName();
        System.out.println(name);
    }
}
