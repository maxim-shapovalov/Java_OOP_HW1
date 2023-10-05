package org.example.hw;

import java.math.BigDecimal;

/**
 * ����� ��������
 */
public class Drinkables extends Product {
    private Double volume;

    /**
     * ���������������� ����������� ��������
     *
     * @param name   ������������ �������
     * @param price  ���� �������
     * @param volume ����� �������
     */
    public Drinkables(String name, BigDecimal price, Double volume) {
        super(name, price);
        this.volume = volume;
    }

    /**
     * ��������� ������ �������
     *
     * @return ����� �������
     */
    public Double getVolume() {
        return volume;
    }

    /**
     * ���������������� �����
     *
     * @return ������������ ��������, ��� ��������� � �����;
     */
    @Override
    public String toString() {
        return super.toString() + "����� = " + volume + " ";
    }

    /**
     * ������� ������ ������� � ��������� �� ������������ ��������
     *
     * @param volume ����� �������
     */
    public void setVolume(Double volume) {
        if (volume > 0) this.volume = volume;
        else System.out.println("����� ������� ������ ���� ������ ����!");
    }
}