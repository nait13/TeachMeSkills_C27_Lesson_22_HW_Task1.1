package org.example;

import org.apache.commons.lang3.StringUtils;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        String str = "jdfhjd djjds OLEG";
        System.out.println(StringUtils.capitalize("hello word"));
        System.out.println(StringUtils.containsAnyIgnoreCase(str, "oleg"));
    }
}
