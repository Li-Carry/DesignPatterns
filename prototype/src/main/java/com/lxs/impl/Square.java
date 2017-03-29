package com.lxs.impl;

import com.lxs.abstra.Shape;

/**
 * Created by carry on 17-3-29.
 */
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
