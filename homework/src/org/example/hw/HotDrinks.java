package org.example.hw;

import java.math.BigDecimal;

/**
 * ����� ������� ��������
 */
public class HotDrinks extends Drinkables {
    private int temp;

    /**
     * ������������� ����������� ������ ������� ��������
     *
     * @param name   ������������ �������
     * @param price  ���� �������
     * @param volume ����� �������
     * @param temp   ����������� �������
     */
    public HotDrinks(String name, BigDecimal price, Double volume, int temp) {
        super(name, price, volume);
        this.temp = temp;
    }

    /**
     * ��������� ����������� �������
     *
     * @return ����������� �������
     */
    public int getTemp() {
        return temp;
    }

    /**
     * ���������������� �����
     *
     * @return ������������ ��������, ���������, ����� � �����������.
     */
    @Override
    public String toString() {
        return super.toString() + "����������� ������� = " + temp;
    }
}
