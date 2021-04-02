package com.company;

public class WheelService extends Service implements WheelChangeable{
    @Override
    public void changeCarWheel(Car car, CarWheels wheels) {
        car.setWheelSize(wheels.getWheels());
    }
}
