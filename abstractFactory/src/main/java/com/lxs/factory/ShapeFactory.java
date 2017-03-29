package com.lxs.factory;

import com.lxs.impl.Circle;
import com.lxs.impl.Rectangle;
import com.lxs.impl.Square;
import com.lxs.inter.Color;
import com.lxs.inter.Shape;

/**
 * Created by carry on 17-3-20.
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }
        if (shape.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shape.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
