package com.company;

import com.company.enums.CarColors;
import com.company.enums.CarEngines;
import com.company.enums.CarWheels;

public class GeelyFactory extends Factory {

    public Car createCar(int year, CarEngines value,
                         CarWheels wheels, CarColors color) {
        createAbsCar(year, value, wheels, color);
        GeelyCar car = new GeelyCar(getCheckedYear(), getCheckedValue(), getCheckedWheels(), getCheckedColor());
        return car;
    }
}
