package weather_App.viewModel;


import weather_App.model.Model;
import weather_App.view.WeatherView;

//singleton design
public class WeatherNotifyingSystemModelView {
    private static WeatherNotifyingSystemModelView weatherNotifyingSystemModelView ;

    private static Model model = new Model();
    private static WeatherView weatherView = new WeatherView();
    private WeatherNotifyingSystemModelView(){

    }

    public static WeatherNotifyingSystemModelView getStart() {
        if (weatherNotifyingSystemModelView ==null){
            weatherNotifyingSystemModelView = new WeatherNotifyingSystemModelView();
        }
        return weatherNotifyingSystemModelView;
    }

    public static String getName() {
       String name =  weatherView.getName("enter your name");
       return name;
    }

    public static String getType() {
        String type =  weatherView.getName("enter your display type");
        return type;
    }

    public static float getTemp() {
        float temp = weatherView.takeDetails("please write temp");
        return temp;
    }
    public static float getPressure() {
        float pressure = weatherView.takeDetails("please write pressure");
        return pressure;
    }
    public static float getHumidity() {
        float humidity = weatherView.takeDetails("please write humidity");
        return humidity;
    }


    public   void start() {

        model.initialize();
        weatherView.printPrompt();
        weatherView.takePrompt();
    }

    public static void fun(int choice){
        model.fun(choice);
    }

}
