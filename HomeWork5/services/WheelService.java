package com.company.services;

import com.company.Car;
import com.company.enums.CarWheels;
import com.company.exceptions.WheelException;
import com.company.interfaces.WheelChangeable;

public class WheelService extends Service implements WheelChangeable {

    @Override
    public void changeCarWheel(Car car, CarWheels wheels) {
        try {
            if (wheels == null)
                throw new WheelException("!Размер колес машины введен не корректно");
        } catch (WheelException e) {
            wheels = CarWheels.SIZE_16;
            System.err.println(e.getMessage());
            System.err.println("Был установлен размер колес по умолчанию: 16");
        }
        car.setWheelSize(wheels.getWheels());
    }
}
