package org.example.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddDrinks {
    public void addDrinks() {
//        HotDrinksVM vm = new HotDrinksVM();
        List<HotDrinks> hd = new ArrayList<>(Arrays.asList(
                new HotDrinks("tea", 1, 60),
                new HotDrinks("coffee", 2, 70),
                new HotDrinks("cocoa", 1, 65),
                new HotDrinks("milk", 2, 40)));
    }
}