package adapterpattern.adapter;

import java.time.Instant;

import adapterpattern.target.ITarget;

public class Adapter implements ITarget {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void logText(String text) {
        this.adaptee.log(text, Instant.now());
    }

}
