package observerpattern;

import observerpattern.display.impl.PhoneDisplay;
import observerpattern.display.impl.WindowDisplay;
import observerpattern.observable.impl.WeatherStation;

public class ObserverRunner {

    public static void main(String[] args) {
        PhoneDisplay androidPhone = new PhoneDisplay("android");
        PhoneDisplay applePhone = new PhoneDisplay("apple");
        WindowDisplay windowDisplay = new WindowDisplay();

        WeatherStation weatherStation = new WeatherStation();
        weatherStation.addObserver(androidPhone);
        weatherStation.addObserver(applePhone);
        weatherStation.addObserver(windowDisplay);
        
        System.out.println("Weather is getting bad! Sending a warning to all devices for the new forecast...");
        weatherStation.notifyObservers();
    }
    
}
