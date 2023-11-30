package com.ecust.deepClone.xulieClone;

import java.io.Serializable;

/**
 * @author: caohao
 * @date: 2023/11/30
 * @time: 19:47
 */
public class Dog implements Serializable {

    private String type;
    private String colour;

    public String getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Dog(String type, String colour) {
        this.type = type;
        this.colour = colour;
    }

}
