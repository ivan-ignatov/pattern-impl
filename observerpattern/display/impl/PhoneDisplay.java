package observerpattern.display.impl;

import observerpattern.display.IDisplay;
import observerpattern.observable.impl.WeatherStation;
import observerpattern.observer.IObserver;

public class PhoneDisplay implements IDisplay, IObserver {

    private String phoneModel;
    private Integer temperature;
    private WeatherStation weatherStation;

    @Override
    public void display() {
        System.out.println("Model " + phoneModel + " / "+ temperature + " Degrees Celsius\r\n" +
                        "         _.-----------._      \r\n" + //
                        "      .-'               `-.   \r\n" + //
                        "    .' ___                 `. \r\n" + //
                        "   |  (_M_) M O T O R O L A  |\r\n" + //
                        "   | .---------------------. |\r\n" + //
                        "   | |         __   _      | |\r\n" + //
                        "   | |       _(  )_( )_    | |\r\n" + //
                        "   | |      (_   _    _)   | |\r\n" + //
                        "   | |     / /(_) (__)     | |\r\n" + //
                        "   | |    / / / / / /      | |\r\n" + //
                        "   | |   / / / / / /       | |\r\n" + //
                        "   | `---------------------' |\r\n\n");
    }
    
    @Override
    public void update() {
        this.temperature = this.weatherStation.getTemperature();
        display();
    }

    public PhoneDisplay(String phoneModel, WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        this.phoneModel = phoneModel;
    }

    public String getPhoneModel() {
        return phoneModel;
    }

    public void setPhoneModel(String phoneModel) {
        this.phoneModel = phoneModel;
    }
}
