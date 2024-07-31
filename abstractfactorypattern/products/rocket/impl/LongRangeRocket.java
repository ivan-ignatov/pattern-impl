package abstractfactorypattern.products.rocket.impl;

import abstractfactorypattern.products.rocket.Rocket;
import abstractfactorypattern.utils.MissionUtils;

public class LongRangeRocket implements Rocket {

    private String type;
    private String range;
    private String designation;
    private Integer cargoCapacity;
    private String image = "\n" + //
            "                    /\\\r\n" + //
            "                   //\\\\\r\n" + //
            "                  ||##||\r\n" + //
            "                 //##mm\\\\\r\n" + //
            "                //##*mmm\\\\\r\n" + //
            "               //###**mmm\\\\\r\n" + //
            "              //###***nmmm\\\\\r\n" + //
            "             //####***@nmmm\\\\\r\n" + //
            "             ||####***@nnmm||\r\n" + //
            "             ||####**@@@nnm||\r\n" + //
            "             |______________|\r\n" + //
            "             |              |\r\n" + //
            "              \\____________/\r\n" + //
            "               |          |\r\n" + //
            "              /|    /\\    |\\\r\n" + //
            "             /_|    || /\\ |_\\\r\n" + //
            "               |          |\r\n" + //
            "               |       \\/ |\r\n" + //
            "               |          |\r\n" + //
            "              /|    /\\    |\\\r\n" + //
            "             / |    ||    | \\\r\n" + //
            "            /  |    ||    |  \\\r\n" + //
            "           /  /\\    ||    /\\  \\\r\n" + //
            "          |__/  \\   ||   /  \\__|\r\n" + //
            "            /____\\      /____\\\r\n" + //
            "            |    |      |    |\r\n" + //
            "            |    |______|    |\r\n" + //
            "            |    | /--\\ |    |\r\n" + //
            "            |____|/----\\|____|\r\n" + //
            "             \\||/ //##\\\\ \\||/\r\n" + //
            "             /##\\//####\\\\/##\\\r\n" + //
            "            //##\\\\/####\\//##\\\\\r\n" + //
            "           ||/::\\||/##\\||/::\\||\r\n" + //
            "           \\\\\\''///:**:\\\\\\''///\r\n" + //
            "            \\\\\\///\\::::/\\\\\\///\r\n" + //
            "             \\\\//\\\\\\::///\\\\//\r\n" + //
            "              \\/\\\\\\\\..////\\/\r\n" + //
            "                 \\\\\\\\////\r\n" + //
            "                  \\\\\\///\r\n" + //
            "                   \\\\//\r\n" + //
            "                    \\/";

    public LongRangeRocket() {
        this.type = "Long Range Rocket";
        this.range = "1.2B - 1.5B km";
        this.designation = MissionUtils.generateLongRangeRocketSerialNumber();
        this.cargoCapacity = 350;
    }

    @Override
    public void printData() {
        System.out.println(
                String.format(
                        "Rocket %s%ntype: %s%nrange: %s%ncargo capacity: %d tons%n",
                        this.designation, this.type, this.range, this.cargoCapacity));
    }

    @Override
    public void printImage() {
        System.out.println(this.image);
    }
}
