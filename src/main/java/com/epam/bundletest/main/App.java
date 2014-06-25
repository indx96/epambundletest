package com.epam.bundletest.main;

import java.util.Locale;
import java.util.ResourceBundle;

public class App {
    public static void main(String[] args) {
        Locale engLocale = new Locale("en");
        Locale ruLocale = new Locale("ru");
        ResourceBundle engResourceBundle = ResourceBundle.getBundle("props", engLocale);
        ResourceBundle ruResourceBundle = ResourceBundle.getBundle("props", ruLocale);
        System.out.println("English text: " + engResourceBundle.getString("text"));
        System.out.println("Russian text: " + ruResourceBundle.getString("text"));
    }
}
