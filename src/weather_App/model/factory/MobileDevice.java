package weather_App.model.factory;

import weather_App.model.factory.dto.InformationDto;

public class MobileDevice extends Device{
    @Override
    public void display(InformationDto info) {
        System.out.println("Welcome to mobile app"+info);
    }
}
