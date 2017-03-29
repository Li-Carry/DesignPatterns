package com.lxs.impl;

import com.lxs.inter.Color;

/**
 * Created by carry on 17-3-20.
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
