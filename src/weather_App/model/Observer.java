package weather_App.model;

public interface Observer {
    void updateWeather(float temperature, float humidity, float pressure);
}
