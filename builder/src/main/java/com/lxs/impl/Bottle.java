package com.lxs.impl;

import com.lxs.inter.Packing;

/**
 * Created by carry on 17-3-21.
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
