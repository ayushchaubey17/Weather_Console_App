package weather_App.model;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
    private List<Observer> subscribers = new ArrayList<>();
    @Override
    public void addSubscriber(Observer subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Observer subscriber) {
            subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(float temperature, float humidity, float pressure) {
        for (Observer subscriber:subscribers){
            subscriber.updateWeather(temperature, humidity, pressure);
        }

    }
}
