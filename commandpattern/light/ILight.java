package commandpattern.light;

public interface ILight {

    String getName();

    Boolean isSwitchedOn();

    void switchPower(Boolean switchPower);

    void setBrightness(Integer brightness);

    Integer getBrightness();
}
