package com.company;

import com.company.enums.CarColors;
import com.company.enums.CarEngines;
import com.company.enums.CarWheels;

public class BmwCar extends Car {

    BmwCar(int yearOfIssue, CarEngines engines, CarWheels wheels, CarColors colors) {
        super("BMW", yearOfIssue, engines.getEngine(), wheels.getWheels(), colors.getColor());
    }
}