package commandpattern.light.impl;

import commandpattern.light.ILight;
import commandpattern.util.LampUtil;

public class Lamp implements ILight {

    private Boolean switchedOn;
    private Integer brightness;
    private Integer maxBrightness;
    private String name;

    public Lamp() {
        this.switchedOn = false;
        this.brightness = 50;
        this.maxBrightness = 100;
        this.name = "Normal lamp " + LampUtil.generateLampSerialNumber();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Boolean isSwitchedOn() {
        return this.switchedOn;
    }

    @Override
    public void switchPower(Boolean switchPower) {
        this.switchedOn = switchPower;
    }

    @Override
    public Integer getBrightness() {
        return this.brightness;
    }

    @Override
    public void setBrightness(Integer brightness) {
        if (brightness > this.maxBrightness) {
            brightness = this.maxBrightness;
        }

        this.brightness = brightness;
        System.out.println("Current brightness: " + this.brightness);
    }

}
