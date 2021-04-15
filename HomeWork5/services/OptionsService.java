package com.company.services;

import com.company.Car;
import com.company.exceptions.OptionsException;
import com.company.interfaces.OptionsChangeable;

public class OptionsService implements OptionsChangeable {

    @Override
    public void addCarOptions(Car car, String option) {
        try {
            if (option == null)
                throw new OptionsException("!Опция машины введена не корректно");
        } catch (OptionsException e) {
            option = "Отсутствует";
            System.err.println(e.getMessage());
            System.err.println("Опция не добавлена");
        }
        if (car.getOptions().equals("Отсутствуют")) {
            car.setOptions(option);
        } else car.setOptions(car.getOptions() + ", " + option);
    }

    @Override
    public void removeCarOptions(Car car) {
        car.setOptions("Отсутствуют");
    }
}
