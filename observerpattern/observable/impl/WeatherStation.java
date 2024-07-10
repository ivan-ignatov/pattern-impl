package observerpattern.observable.impl;

import java.util.ArrayList;
import java.util.List;

import observerpattern.observable.IObservable;
import observerpattern.observer.IObserver;

public class WeatherStation implements IObservable {

    private Integer temperature;

    private List<IObserver> observerList = new ArrayList<>();

    public void addObserver(IObserver observer) {
        observerList.add(observer);
    }

    public void removeObserver(IObserver observer) {
        observerList.remove(observer);
    }
    
    public void notifyObservers() {
        observerList.forEach(IObserver::update);
    }
    
    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }
}
