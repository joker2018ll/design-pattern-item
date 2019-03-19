package com.gupao.vip.edu.pattern.prototype;

import java.io.Serializable;

/**
 * Created by ll on 2019/3/13.
 */

public class Email implements Serializable {

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Email(String content) {
        this.content = content;
    }
}
