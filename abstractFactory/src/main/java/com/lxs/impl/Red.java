package com.lxs.impl;

import com.lxs.inter.Color;

/**
 * Created by carry on 17-3-20.
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
