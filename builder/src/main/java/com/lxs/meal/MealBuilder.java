package com.lxs.meal;

import com.lxs.impl.ChickenBurger;
import com.lxs.impl.Coke;
import com.lxs.impl.Pepsi;
import com.lxs.impl.VegBurger;

import java.lang.reflect.Method;

/**
 * Created by carry on 17-3-21.
 */
public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
