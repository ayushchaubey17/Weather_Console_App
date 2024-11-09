package weather_App.model.factory;

import weather_App.model.Observer;
import weather_App.model.factory.dto.InformationDto;

public abstract class Device   {
    public abstract void  display(InformationDto info);
}
