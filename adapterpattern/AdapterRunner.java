package adapterpattern;

import adapterpattern.adapter.Adaptee;
import adapterpattern.adapter.Adapter;
import adapterpattern.target.ITarget;

public class AdapterRunner {
    public static void main(String[] args) {
        ITarget logger = new Adapter(new Adaptee());
        logger.logText("this is a text");
    }
}
