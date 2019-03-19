package com.gupao.vip.edu.factory.func;

import com.gupao.vip.edu.factory.Milk;
import com.gupao.vip.edu.factory.SanLu;

/**
 * #ClassName SanLuFactory
 * #Description TODO
 * #Date 2019/3/19 23:38
 * #Version 1.0
 **/
public class SanLuFactory implements Factory {
    @Override
    public Milk getMilk() {
        return new SanLu();
    }
}
