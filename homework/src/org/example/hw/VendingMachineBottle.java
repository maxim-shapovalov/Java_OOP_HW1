package org.example.hw;

import java.util.ArrayList;
import java.util.List;

/**
 * ����� ��������� �������� �������������� ����
 */
public class VendingMachineBottle implements VendingMachine {
    List<BottleOfWater> bottleOfWaterList = new ArrayList<>();

    /**
     * ���������������� ����� �������� ��������� � �������
     */
    @Override
    public void initProduct() {
    }

    /**
     * ������������� ����� �������� �������������� ����
     *
     * @param bottle ���� ����������� ������ �������������� ����
     */
    public void initProduct(List<BottleOfWater> bottle) {
        this.bottleOfWaterList = bottle;
    }

    /**
     * ���������������� ����� ��������� ��������� �� ��������
     *
     * @return null
     */
    @Override
    public String getProduct() {
        return null;
    }

    /**
     * ������������� ����� ��������� �������������� ����
     *
     * @param name ������������ ������ ����
     * @return � ��������� ���� ���������� ���������� ������ BottleOfWater, ��� �� �������.
     */
    public String getProduct(String name) {
        for (BottleOfWater el : bottleOfWaterList) {
            if (el.getName().equals(name)) return el.toString();
        }
        return "�� �������";
    }
}
