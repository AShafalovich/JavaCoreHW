package com.company;

import com.company.enums.CarColors;
import com.company.enums.CarEngines;
import com.company.enums.CarWheels;
import com.company.exceptions.CarCreateException;
import com.company.exceptions.ColorException;
import com.company.exceptions.WheelException;
import com.company.interfaces.CarCreatable;

public abstract class Factory implements CarCreatable {

    private int checkedYear;
    private CarEngines checkedValue;
    private CarWheels checkedWheels;
    private CarColors checkedColor;

    public void createAbsCar(int year, CarEngines value,
                             CarWheels wheels, CarColors color) {
        try {
            if (year < 1990 || year > 2021)
                throw new CarCreateException("!Год выпуска машины введен не корректно");
        } catch (CarCreateException e) {
            System.err.println(e.getMessage());
            if (year < 1990) {
                year = 1990;
                System.err.println("Был установлен минимальный год выпуска: 1990");
            } else {
                year = 2021;
                System.err.println("Был установлен максимальный год выпуска: 2021г");
            }
        }
        try {
            if (value == null)
                throw new CarCreateException("!Объем двигателя машины введен не корректно");
        } catch (CarCreateException e) {
            value = CarEngines.ENGINE1_5;
            System.err.println(e.getMessage());
            System.err.println("Был установлен объем двигателя по умолчанию: 1.5");
        }
        try {
            if (wheels == null)
                throw new WheelException("!Размер колес машины введен не корректно");
        } catch (WheelException e) {
            wheels = CarWheels.SIZE_16;
            System.err.println(e.getMessage());
            System.err.println("Был установлен размер колес по умолчанию: 16");
        }
        try {
            if (color == null)
                throw new ColorException("!Цвет машины введен не корректно");
        } catch (ColorException e) {
            color = CarColors.BLACK;
            System.err.println(e.getMessage());
            System.err.println("Был установлен цвет машины по умолчанию: Black");
        }
        checkedYear = year;
        checkedValue = value;
        checkedWheels = wheels;
        checkedColor = color;
    }

    public int getCheckedYear() {
        return checkedYear;
    }

    public CarEngines getCheckedValue() {
        return checkedValue;
    }

    public CarWheels getCheckedWheels() {
        return checkedWheels;
    }

    public CarColors getCheckedColor() {
        return checkedColor;
    }
}
