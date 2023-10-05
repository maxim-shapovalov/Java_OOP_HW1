package org.example.hw;

import java.math.BigDecimal;

/**
 * ����������� ����� ���� ���������
 */
public abstract class Product {
    private String name;
    private BigDecimal price;

    /**
     * ����������� �� ���������, ��� ����������
     */
    public Product() {
    }

    /**
     * ����������� � ����� �����������
     *
     * @param name  ������������ ��������
     * @param price ���� ��������
     */
    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    /**
     * ��������� ������������ ��������
     *
     * @return ������������ ��������
     */
    public String getName() {
        return name;
    }

    /**
     * ������� ������������ ��������
     *
     * @param name ������������ ��������
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * ��������� ���� ��������
     *
     * @return ���� ��������
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * ������� ���� �������� � ��������� �� ������������ ����
     *
     * @param price ���� ��������
     */
    public void setPrice(BigDecimal price) {
        if (price.compareTo(BigDecimal.valueOf(0)) > 0) this.price = price;
        else System.out.println("��������� �� ����� ���� ����� ��� ������ ����!");
    }

    /**
     * ��������� ����������� ���������� ������� � �������� ����
     *
     * @return ������������ �������� � ��� ���������;
     */
    @Override
    public String toString() {
        return "\"" + name + "\" �����: " + price + " �.�. ";
    }
}
