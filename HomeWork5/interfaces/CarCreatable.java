package com.company.interfaces;

import com.company.Car;
import com.company.enums.CarColors;
import com.company.enums.CarEngines;
import com.company.enums.CarWheels;

public interface CarCreatable {

    Car createCar(int year, CarEngines volume,
                  CarWheels wheels, CarColors color);
}
