package com.company.interfaces;

import com.company.Car;
import com.company.enums.CarColors;

public interface ColorChangeable {

    void changeCarColor(Car car, CarColors color);
}
