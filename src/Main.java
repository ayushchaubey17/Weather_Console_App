import weather_App.viewModel.WeatherNotifyingSystemModelView;

public class Main {
    public static void main(String[] args) {
      var instance =  WeatherNotifyingSystemModelView.getStart();

      instance.start();

    }
}