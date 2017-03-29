package com.lxs.impl;

import com.lxs.inter.Item;
import com.lxs.inter.Packing;

/**
 * Created by carry on 17-3-21.
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
