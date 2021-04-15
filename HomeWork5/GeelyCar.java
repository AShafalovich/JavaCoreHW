package com.company;

import com.company.enums.CarColors;
import com.company.enums.CarEngines;
import com.company.enums.CarWheels;

public class GeelyCar extends Car {

    GeelyCar(int yearOfIssue, CarEngines engines, CarWheels wheels, CarColors colors) {
        super("Geely", yearOfIssue, engines.getEngine(), wheels.getWheels(), colors.getColor());
    }
}
