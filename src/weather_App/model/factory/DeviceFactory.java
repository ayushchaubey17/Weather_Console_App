package weather_App.model.factory;

public abstract class DeviceFactory {
    public static  Device getDevice(String type){
        if (type.equalsIgnoreCase("mobile")) return  new MobileDevice();
        else if(type.equalsIgnoreCase("lcd")) return  new LcdDisplay();

        return  null;
    }
}
