package com.lxs.impl;

import com.lxs.inter.Item;
import com.lxs.inter.Packing;

/**
 * Created by carry on 17-3-21.
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
