package org.example.hw;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *  ласс автомата гор€чих напитков
 */
public class VendingMachineHotDrinks implements VendingMachine {
    List<HotDrinks> hotDrinksList = new ArrayList<>();
    List<HotDrinks> resultFind = new ArrayList<>();

    /**
     * ѕереопределенный метод интерфейса VendingMachine
     */
    @Override
    public void initProduct() {
    }

    /**
     * ѕерегруженный метод
     *
     * @param list лист объектов класса hotDrinks
     */
    public void initProduct(List<HotDrinks> list) {
        this.hotDrinksList = list;
    }

    /**
     * ѕереопределенный метод
     *
     * @return null
     */
    @Override
    public String getProduct() {
        return null;
    }

    /**
     * ѕерегруженный метод получени€ гор€чего напитка по названию
     *
     * @return —писок найденных экземпл€ров класса HotDrinks
     */
    public String getProduct(String name) {
        resultFind.clear();
        for (HotDrinks el : hotDrinksList) {
            if (el.getName().equals(name)) resultFind.add(el);
        }
        return resultFind.toString();
    }

    /**
     * ѕерегруженный метод получени€ гор€чего напитка по цене (меньшей или равной)
     *
     * @return —писок найденных экземпл€ров класса HotDrinks
     */
    public String getProduct(BigDecimal price) {
        resultFind.clear();
        for (HotDrinks el : hotDrinksList) {
            if (el.getPrice().compareTo(price) <= 0) resultFind.add(el);
        }
        return resultFind.toString();
    }

    /**
     * ѕерегруженный метод получени€ гор€чего напитка по цене (меньшей или равной)
     *
     * @return —писок найденных экземпл€ров класса HotDrinks
     */
    public String getProduct(int temp) {
        resultFind.clear();
        for (HotDrinks el : hotDrinksList) {
            if (el.getTemp() <= temp) resultFind.add(el);
        }
        return resultFind.toString();
    }
}
