## Question: Weather Monitoring System
You are tasked with designing a Weather Monitoring System using the Observer Pattern. The system has a WeatherStation that tracks temperature, humidity, and pressure. Multiple devices (observers) are interested in this weather data, including a MobileDevice, WebDashboard, and LCDDisplay.

Whenever there is a change in temperature, humidity, or pressure, the WeatherStation should automatically notify all the registered devices, which will then update their displays.

Requirements
WeatherStation (Subject):

Tracks temperature, humidity, and pressure.
Allows devices to subscribe and unsubscribe to weather updates.
Notifies all subscribed devices whenever there is a change in any of the tracked data.
Devices (Observers):

MobileDevice: Displays the updated weather data in a mobile-friendly format.
WebDashboard: Shows the weather data on a web interface.
LCDDisplay: Displays the data in a concise format for LCD screens.
Actions:

The WeatherStation can set new values for temperature, humidity, and pressure.
When new values are set, it should notify all subscribed devices to display the latest data.
Each device should implement a way to display the weather data uniquely (e.g., different print statements or formats).
## Class Diagram Suggestions
### Subject Interface:
#### Methods: 
###### addSubscriber(Observer obj), 
###### removeSubscriber(Observer obj)
###### notifySubscribers().

### Observer Interface:
### Method: 
###### updateWeather(float temperature, float humidity, float pressure).


WeatherStation Class (implements Subject):
Holds the weather data (temperature, humidity, pressure).
Has a list of subscribed observers.
Device Classes (MobileDevice, WebDashboard, LCDDisplay, all implement Observer):
Each device class should implement updateWeather to display weather data in its specific way.
Example Usage
Instantiate a WeatherStation.
Create several devices and subscribe them to the WeatherStation.
Set new weather data in the WeatherStation and observe how all devices receive and display the updated data.