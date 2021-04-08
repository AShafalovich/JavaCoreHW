package com.company;

public class OptionsService implements OptionsChangeable {

    @Override
    public void addCarOptions(Car car, String option) {
        if (car.getOptions().equals("Отсутствуют")) {
            removeCarOptions(car);
            car.setOptions(option);
        } else car.setOptions(car.getOptions() + ", " + option);
    }

    @Override
    public void removeCarOptions(Car car) {
        car.setOptions("Отсутствуют");
    }
}
