package com.simple.pattern;

import builder.AlertDialog;
import decorator.Chicken;
import decorator.Pizza;
import decorator.Vegan;
import observer.YoutubeChannel;
import observer.YoutubeSubscriber;
import strategy.EmailSendingMethod;
import strategy.MessageSender;
import strategy.SmsSendingMethod;
import template.Meal;
import template.Steak;

public class TestDrive {

    public static void main(String[] args) {
        MessageSender sender = new MessageSender();
        sender.setMethod(new EmailSendingMethod());
        sender.send("alice@gmail.com", "bob@gmail.com", "Love letter");
        sender.setMethod(new SmsSendingMethod());
        sender.send("09-213-213", "230-120-1121", "Urgent issues");
    }
}
