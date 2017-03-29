package com.lxs.factory;

import com.lxs.impl.*;
import com.lxs.inter.SingleObject;

/**
 * Created by carry on 17-3-20.
 */
public class SingleFactory {
    public static SingleObject getInstance(int n) {
        if (n == 1) {
            return SingleObject1.getInstance();
        } else if (n == 2) {
            return SingleObject2.getInstance();
        } else if (n == 3) {
            return SingleObject3.getInstance();
        } else if (n == 4) {
            return SingleObject4.getInstance();
        } else if (n == 5) {
            return SingleObject5.getInstance();
        } else if (n == 6) {
            return SingleObject6.instance;
        } else {
            return null;
        }
    }
}
