package adapterpattern.adapter;

import java.time.Instant;

public class Adaptee {

    public void log(String text, Instant time) {
        System.out.println("[" + time + "] = " + text);
    }
}
