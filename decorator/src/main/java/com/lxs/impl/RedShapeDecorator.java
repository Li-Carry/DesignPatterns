package com.lxs.impl;

import com.lxs.decorator.ShapeDecorator;
import com.lxs.inter.Shape;

/**
 * Created by carry on 17-3-29.
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }
}
