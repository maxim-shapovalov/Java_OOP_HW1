package org.example.hw;

/**
 * ��������� ��������� ��������
 */
public interface VendingMachine {
    /**
     * �������� ��������� � �������� �������
     */
    void initProduct();

    /**
     * ��������� �������� �� ��������� ��������
     *
     * @return ������
     */
    String getProduct();
}
