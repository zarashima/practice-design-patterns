package com.simple.pattern;

import builder.AlertDialog;
import decorator.Chicken;
import decorator.Pizza;
import decorator.Vegan;
import observer.YoutubeChannel;
import observer.YoutubeSubscriber;
import template.Meal;
import template.Steak;

public class TestDrive {

    public static void main(String[] args) {
        YoutubeChannel youtubeChannel = new YoutubeChannel();
        YoutubeSubscriber subscriberA = new YoutubeSubscriber(youtubeChannel);
        YoutubeSubscriber subscriberB = new   YoutubeSubscriber(youtubeChannel);
        YoutubeSubscriber subscriberC = new YoutubeSubscriber(youtubeChannel);
        youtubeChannel.addObserver(subscriberA);
        youtubeChannel.addObserver(subscriberB);
        youtubeChannel.addObserver(subscriberC);
        youtubeChannel.releaseNewVideo("Design Patterns : Factory Method");
        youtubeChannel.releaseNewVideo("Design Patterns : Proxy");
        youtubeChannel.releaseNewVideo("Design Patterns : Visitor");
    }
}
