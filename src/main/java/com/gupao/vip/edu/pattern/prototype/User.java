package com.gupao.vip.edu.pattern.prototype;

import java.io.*;

/**
 * Created by ll on 2019/3/13.
 */
public class User implements Serializable, Cloneable{

    private String name;
    private Email email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public User(String name) {
        this.name = name;
    }

    @Override
    public Object clone() {
        Object o = null;
        try {
            //Object中的clone()识别出你要复制的是哪一个对象
            o = super.clone();
        }catch (CloneNotSupportedException e) {
            System.out.println(e.toString());
        }
        return o;
    }

    //深克隆
    public Object deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }
}
