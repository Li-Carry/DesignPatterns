package com.lxs.decorator;

import com.lxs.inter.Shape;

/**
 * Created by carry on 17-3-22.
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw() {
        decoratedShape.draw();
    }
}
