package abstractfactorypattern.products.rocket.impl;

import abstractfactorypattern.products.rocket.Rocket;
import abstractfactorypattern.utils.MissionUtils;

public class CloseRangeRocket implements Rocket {

    private String type;
    private String range;
    private String designation;
    private Integer cargoCapacity;
    private String image = "\n" + //
            "       !\r\n" + //
            "       !\r\n" + //
            "       ^\r\n" + //
            "      / \\\r\n" + //
            "     /___\\\r\n" + //
            "    |=   =|\r\n" + //
            "    |     |\r\n" + //
            "    |     |\r\n" + //
            "    |     |\r\n" + //
            "    |     |\r\n" + //
            "    |     |\r\n" + //
            "    |     |\r\n" + //
            "    |     |\r\n" + //
            "    |     |\r\n" + //
            "    |     |\r\n" + //
            "   /|##!##|\\\r\n" + //
            "  / |##!##| \\\r\n" + //
            " /  |##!##|  \\\r\n" + //
            "|  / ^ | ^ \\  |\r\n" + //
            "| /  ( | )  \\ |\r\n" + //
            "|/   ( | )   \\|\r\n" + //
            "    ((   ))\r\n" + //
            "   ((  :  ))\r\n" + //
            "   ((  :  ))\r\n" + //
            "    ((   ))\r\n" + //
            "     (( ))\r\n" + //
            "      ( )\r\n" + //
            "       .\r\n" + //
            "       .\r\n" + //
            "       .";

    public CloseRangeRocket() {
        this.type = "Close Range Rocket";
        this.range = "650M - 800M km";
        this.designation = MissionUtils.generateCloseRangeRocketSerialNumber();
        this.cargoCapacity = 200;
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
