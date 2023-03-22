package org.example.model;

import java.util.ArrayList;
import java.util.List;

public  class HotDrinksVM extends VendingMachineParameterized{

    List<HotDrinks> hotDrinks = new ArrayList<>();

    public void initDrinks(List<HotDrinks> drinks) {
        this.hotDrinks = drinks;
    }

    @Override
    Object getVendingMach(Object name, Object volume) {
        for (HotDrinks hd: hotDrinks) {
            if (hd.getName().contains((CharSequence) name) && hd.getVolume().equals(volume))
                return hd.getName() + " " + hd.getVolume() + " " + hd.getTemperature();
        }
        return new HotDrinks("Не найдено!", 0, 0).toString();

    }
    public String getVendingMach(String name, int volume, int temperature) {
        List <HotDrinks> bottleOfWaterList = new ArrayList<>();
        for (HotDrinks hd: hotDrinks) {
            if (hd.getName().contains(name) && hd.getVolume().equals(volume) && hd.getTemperature().equals(temperature) ){
                bottleOfWaterList.add(hd);
            }
        }
        return bottleOfWaterList.toString();
    }


}
