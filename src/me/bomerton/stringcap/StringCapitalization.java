package me.bomerton.stringcap;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
//s
public class StringCapitalization {

    public void method() {
        String string = "cheff, poos, music";
        String[] computed = string.split(", ");

        Set<String> list = new HashSet<>();

        Collections.addAll(list, computed);

        // Sets are unsorted, so it will print a random item by default.
        list.forEach(Capitalize.capitalize(System.out::println));
    }
}
