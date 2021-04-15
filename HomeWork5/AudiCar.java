package com.company;

import com.company.enums.CarColors;
import com.company.enums.CarEngines;
import com.company.enums.CarWheels;

public class AudiCar extends Car {

    AudiCar(int yearOfIssue, CarEngines engines, CarWheels wheels, CarColors colors) {
        super("Audi", yearOfIssue, engines.getEngine(), wheels.getWheels(), colors.getColor());
    }
}

