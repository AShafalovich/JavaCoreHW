package com.company.interfaces;

import com.company.Car;

public interface OptionsChangeable {

    void addCarOptions(Car car, String option);

    void removeCarOptions(Car car);
}
