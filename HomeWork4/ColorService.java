package com.company;

public class ColorService extends Service implements ColorChangeable {

    @Override
    public void changeCarColor(Car car, CarColors color) {
        car.setColor(color.getColor());
    }
}
