package observerpattern;

import observerpattern.observable.impl.WeatherStation;
import observerpattern.observer.display.impl.PhoneDisplay;
import observerpattern.observer.display.impl.WindowDisplay;

public class ObserverRunner {

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        PhoneDisplay androidPhone = new PhoneDisplay("android", weatherStation);
        PhoneDisplay applePhone = new PhoneDisplay("apple", weatherStation);
        WindowDisplay windowDisplay = new WindowDisplay(weatherStation);

        weatherStation.addObserver(androidPhone);
        weatherStation.addObserver(applePhone);
        weatherStation.addObserver(windowDisplay);
        
        System.out.println("Weather is getting bad! Sending a warning to all devices for the new forecast...");
        weatherStation.setTemperature(9);
        weatherStation.notifyObservers();
    }
    
}
