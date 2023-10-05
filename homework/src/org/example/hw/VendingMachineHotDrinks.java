package org.example.hw;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * ����� �������� ������� ��������
 */
public class VendingMachineHotDrinks implements VendingMachine {
    List<HotDrinks> hotDrinksList = new ArrayList<>();
    List<HotDrinks> resultFind = new ArrayList<>();

    /**
     * ���������������� ����� ���������� VendingMachine
     */
    @Override
    public void initProduct() {
    }

    /**
     * ������������� �����
     *
     * @param list ���� �������� ������ hotDrinks
     */
    public void initProduct(List<HotDrinks> list) {
        this.hotDrinksList = list;
    }

    /**
     * ���������������� �����
     *
     * @return null
     */
    @Override
    public String getProduct() {
        return null;
    }

    /**
     * ������������� ����� ��������� �������� ������� �� ��������
     *
     * @return ������ ��������� ����������� ������ HotDrinks
     */
    public String getProduct(String name) {
        resultFind.clear();
        for (HotDrinks el : hotDrinksList) {
            if (el.getName().equals(name)) resultFind.add(el);
        }
        return resultFind.toString();
    }

    /**
     * ������������� ����� ��������� �������� ������� �� ���� (������� ��� ������)
     *
     * @return ������ ��������� ����������� ������ HotDrinks
     */
    public String getProduct(BigDecimal price) {
        resultFind.clear();
        for (HotDrinks el : hotDrinksList) {
            if (el.getPrice().compareTo(price) <= 0) resultFind.add(el);
        }
        return resultFind.toString();
    }

    /**
     * ������������� ����� ��������� �������� ������� �� ���� (������� ��� ������)
     *
     * @return ������ ��������� ����������� ������ HotDrinks
     */
    public String getProduct(int temp) {
        resultFind.clear();
        for (HotDrinks el : hotDrinksList) {
            if (el.getTemp() <= temp) resultFind.add(el);
        }
        return resultFind.toString();
    }
}
