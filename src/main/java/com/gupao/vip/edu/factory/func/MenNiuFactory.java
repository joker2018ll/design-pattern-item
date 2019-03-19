package com.gupao.vip.edu.factory.func;

import com.gupao.vip.edu.factory.MengNiu;
import com.gupao.vip.edu.factory.Milk;

/**
 * #ClassName MenNiuFactory
 * #Description TODO
 * #Date 2019/3/19 23:36
 * #Version 1.0
 **/
public class MenNiuFactory implements Factory {
    @Override
    public Milk getMilk() {
        return new MengNiu();
    }
}
