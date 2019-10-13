package com.simple.pattern;

import builder.AlertDialog;
import decorator.Chicken;
import decorator.Pizza;
import decorator.Vegan;
import template.Meal;
import template.Steak;

public class TestDrive {

    public static void main(String[] args) {
        // Builder
        AlertDialog twoButtonsDialog = new AlertDialog.Builder()
                .setTitle("Two buttons dialog")
                .setText("You can use either `Okay` or `Cancel`")
                .setApplyButton("Okay")
                .setCancelButton("Cancel")
                .build();
        System.out.println(twoButtonsDialog);

        //Decorator
        Pizza veganPizzaDecor = new Vegan();
        veganPizzaDecor = new Chicken(veganPizzaDecor);
        System.out.println(veganPizzaDecor.getDescription());

        //Template
        Meal steak = new Steak();
        steak.doMeal();
    }
}
