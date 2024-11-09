package weather_App.model.factory.dto;

public class InformationDto

{
    private float temperature;

    public InformationDto(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
    }

    private float pressure;
    private float humidity;


    @Override
    public String toString() {
        return "the currrent weather condition is temperature"+this.temperature+ ", pressure : "+this.pressure+",humidity:"+this.humidity;
    }
}
