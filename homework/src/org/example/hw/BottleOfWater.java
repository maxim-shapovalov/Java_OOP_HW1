package org.example.hw;
import java.math.BigDecimal;

    /**
     * ����� �������������� ��������
     */
    public class BottleOfWater extends Drinkables {
        /**
         * ������������� ����������� ������ �������������� ��������
         *
         * @param name   ������������ �������
         * @param price  ��������� �������
         * @param volume ����� �������
         */
        public BottleOfWater(String name, BigDecimal price, Double volume) {
            super(name, price, volume);
        }
    }

