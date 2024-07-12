package observerpattern.observer.display.impl;

import observerpattern.observable.impl.WeatherStation;
import observerpattern.observer.IObserver;
import observerpattern.observer.display.IDisplay;

public class WindowDisplay implements IDisplay, IObserver {

    private Integer temperature;
    private WeatherStation weatherStation;

    public WindowDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void display() {
        System.out.println("      ______________________________________________________________\r\n" + //
                        "     .'  __________________________________________________________  '.\r\n" + //
                        "     : .'                                                          '. :\r\n" + //
                        "     | |      ________________________________________________      | |\r\n" + //
                        "     | |    .:________________________________________________:.    | |\r\n" + //
                        "     | |    |                                                  |    | |\r\n" + //
                        "     | |    |                                                  |    | |\r\n" + //
                        "     | |    |                       __   _                     |    | |\r\n" + //
                        "     | |    |                     _(  )_( )_                   |    | |\r\n" + //
                        "     | |    |                    (_   _    _)                  |    | |\r\n" + //
                        "     | |    |                   / /(_) (__)                    |    | |\r\n" + //
                        "     | |    |                  / / / / / /                     |    | |\r\n" + //
                        "     | |    |                 / / / / / /                      |    | |\r\n" + //
                        "     | |    |                                                  |    | |\r\n" + //
                        "     | |    |                     " + this.temperature + " Degrees                     |    | |\r\n" + //
                        "     | |    |            __________________________            |    | |\r\n" + //
                        "     | |    |           |  |  |  |  |  |  |  |  |  |           |    | |\r\n" + //
                        "     | |    '.__________|__|__|__|__|__|__|__|__|__|__________.'    | |\r\n" + //
                        "     | |                                                            | |\r\n" + //
                        "     | |                                                            | |\r\n" + //
                        "     : '.__________________________________________________________.' :\r\n" + //
                        "      \".____________________________\\__/____________________________.\"\r\n" + //
                        "                                     ||\r\n" + //
                        "                                     ||\r\n" + //
                        "                                     ||\r\n" + //
                        "                                  ___||___");
    }
    
    public void update() {
        this.temperature = this.weatherStation.getTemperature();
        display();
    }
}
