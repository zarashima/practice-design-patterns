package com.simple.pattern;

import builder.AlertDialog;

public class Test {

    public static void main(String[] args) {
        AlertDialog twoButtonsDialog = new AlertDialog.Builder()
                .setTitle("Two buttons dialog")
                .setText("You can use either `Okay` or `Cancel`")
                .setApplyButton("Okay")
                .setCancelButton("Cancel")
                .build();

        System.out.println(twoButtonsDialog);
    }
}
