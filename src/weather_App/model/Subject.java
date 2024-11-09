package weather_App.model;

public interface Subject {
    void  addSubscriber(Observer subscriber);
    void  removeSubscriber(Observer subscriber);
    void  notifySubscribers(float temperature, float humidity, float pressure);
}
