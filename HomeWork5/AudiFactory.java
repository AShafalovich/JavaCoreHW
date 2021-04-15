package com.company;

import com.company.enums.CarColors;
import com.company.enums.CarEngines;
import com.company.enums.CarWheels;

public class AudiFactory extends Factory {

    @Override
    public Car createCar(int year, CarEngines value,
                         CarWheels wheels, CarColors color) {
        createAbsCar(year, value, wheels, color);
        AudiCar car = new AudiCar(getCheckedYear(), getCheckedValue(), getCheckedWheels(), getCheckedColor());
        return car;
    }
}
