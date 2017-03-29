package com.lxs.impl;

import com.lxs.abstra.Shape;

/**
 * Created by carry on 17-3-29.
 */
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
