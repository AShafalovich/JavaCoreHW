package com.company;

import com.company.enums.CarColors;
import com.company.menu.MenuMain;
import com.company.services.ColorService;
import com.company.services.OptionsService;
import com.company.services.WheelService;

public class Main {

    public static void main(String[] args) {

        ColorService colorService = new ColorService();
        WheelService wheelService = new WheelService();
        OptionsService optionsService = new OptionsService();

        AudiFactory audiFactory = new AudiFactory();
        BmwFactory bmwFactory = new BmwFactory();
        GeelyFactory geelyFactory = new GeelyFactory();

        Garage garage = new Garage();
        Salon salon = new Salon(colorService, wheelService, optionsService);



    }
}

