package weather_App.model;


import weather_App.model.factory.Device;
import weather_App.model.factory.DeviceFactory;
import weather_App.model.factory.dto.InformationDto;

public class Subscriber  implements Observer{
    private String name;
    private String type;

    public Subscriber(String name, String type) {
        this.name = name;
        this.type = type;
    }



    @Override
    public void updateWeather(float temperature, float humidity, float pressure) {
      Device myDevice =   DeviceFactory.getDevice(this.type);
      myDevice.display(new InformationDto(temperature,humidity,pressure));

    }






}
