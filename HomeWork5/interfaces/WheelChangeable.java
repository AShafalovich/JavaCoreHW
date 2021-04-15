package com.company.interfaces;

import com.company.Car;
import com.company.enums.CarWheels;

public interface WheelChangeable {

    void changeCarWheel(Car car, CarWheels wheels);
}
