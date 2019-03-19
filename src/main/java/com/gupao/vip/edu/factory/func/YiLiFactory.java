package com.gupao.vip.edu.factory.func;

import com.gupao.vip.edu.factory.Milk;
import com.gupao.vip.edu.factory.YiLi;

/**
 * #ClassName YiLiFactory
 * #Description TODO
 * #Date 2019/3/19 23:37
 * #Version 1.0
 **/
public class YiLiFactory implements Factory {
    @Override
    public Milk getMilk() {
        return new YiLi();
    }
}
