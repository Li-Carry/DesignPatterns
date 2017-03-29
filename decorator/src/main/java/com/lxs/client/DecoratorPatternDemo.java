package com.lxs.client;

import com.lxs.impl.Circle;
import com.lxs.impl.Rectangle;
import com.lxs.impl.RedShapeDecorator;
import com.lxs.inter.Shape;

/**
 * Created by carry on 17-3-29.
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
