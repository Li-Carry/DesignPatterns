package com.lxs.client;

import com.lxs.factory.AbstractFactory;
import com.lxs.factory.ColorFactory;
import com.lxs.factory.ShapeFactory;

/**
 * Created by carry on 17-3-20.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}
