package com.lxs.impl;

import com.lxs.inter.Shape;

/**
 * Created by carry on 17-3-22.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
