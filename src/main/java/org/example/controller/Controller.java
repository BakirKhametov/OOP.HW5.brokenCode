package org.example.controller;
import org.example.model.HotDrinks;
import org.example.model.HotDrinksVM;
import org.example.model.AddDrinks;

import java.util.List;

public class Controller {
    public void searchDrinks(List<HotDrinks> hd){
        HotDrinksVM vm = new HotDrinksVM();
        vm.initDrinks(hd);
        vm.getVendingMach("tea", 1, 60);
    }
}
