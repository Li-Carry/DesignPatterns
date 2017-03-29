package com.lxs.factory;

import com.lxs.impl.Blue;
import com.lxs.impl.Green;
import com.lxs.impl.Red;
import com.lxs.inter.Color;
import com.lxs.inter.Shape;

/**
 * Created by carry on 17-3-20.
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
