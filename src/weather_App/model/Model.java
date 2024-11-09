package weather_App.model;

import weather_App.viewModel.WeatherNotifyingSystemModelView;

public class Model {
  private   Subject chennaiWeather = new WeatherStation();

    public void initialize(){



        Observer subscriber1 = new Subscriber("Ayush","mobile");
        chennaiWeather.addSubscriber(subscriber1);
        chennaiWeather.notifySubscribers(12,43,54);


    }


    public void fun(int prompt) {
        if (prompt ==1){
            String name= WeatherNotifyingSystemModelView.getName();
            String type= WeatherNotifyingSystemModelView.getType();
            chennaiWeather.addSubscriber(new Subscriber(name, type));
        } else if (prompt ==2) {
            String name= WeatherNotifyingSystemModelView.getName();
            String type= WeatherNotifyingSystemModelView.getType();
            chennaiWeather.removeSubscriber(new Subscriber(name, type));

        } else if (prompt==3) {
            float temp = WeatherNotifyingSystemModelView.getTemp();
            float humidity= WeatherNotifyingSystemModelView.getHumidity();
            float pressure = WeatherNotifyingSystemModelView.getPressure();
            chennaiWeather.notifySubscribers(temp,humidity,pressure);

        }
    }
}
