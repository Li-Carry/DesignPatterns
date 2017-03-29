package com.lxs.factory;

import com.lxs.inter.Color;
import com.lxs.inter.Shape;

/**
 * Created by carry on 17-3-20.
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
