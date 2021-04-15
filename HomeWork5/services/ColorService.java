package com.company.services;

import com.company.Car;
import com.company.enums.CarColors;
import com.company.exceptions.ColorException;
import com.company.interfaces.ColorChangeable;

public class ColorService extends Service implements ColorChangeable {

    @Override
    public void changeCarColor(Car car, CarColors color) {
        try {
            if (color == null)
                throw new ColorException("!Цвет машины введен не корректно");
        } catch (ColorException e) {
            color = CarColors.BLACK;
            System.err.println(e.getMessage());
            System.err.println("Был установлен цвет машины по умолчанию: Black");
        }
        car.setColor(color.getColor());
    }
}
