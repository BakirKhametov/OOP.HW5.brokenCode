package org.example.view;


import  org.example.controller.Controller;
import org.example.model.HotDrinks;
import  org.example.model.HotDrinksVM;

import java.util.List;

public class UserInterface {
    public void printDrinks(List<HotDrinks> drinks) {
        HotDrinksVM drinksVM = new HotDrinksVM();
        System.out.println(drinksVM.getVendingMach(null, 0, 0));
    }
}



