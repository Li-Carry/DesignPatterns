package com.lxs.impl;

import com.lxs.abstra.Shape;

/**
 * Created by carry on 17-3-29.
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
