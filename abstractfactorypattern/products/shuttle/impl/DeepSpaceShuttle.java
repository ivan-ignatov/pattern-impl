package abstractfactorypattern.products.shuttle.impl;

import abstractfactorypattern.products.shuttle.Shuttle;
import abstractfactorypattern.utils.MissionUtils;

public class DeepSpaceShuttle implements Shuttle {

    private String type;
    private String range;
    private String serialNumber;
    private Integer cargoCapacity;
    private Integer crewCapacity;
    private Integer length;

    private String image = "\n" + //
            "       _________\r\n" + //
            "      (=========)\r\n" + //
            "      |=========|\r\n" + //
            "      |====_====|\r\n" + //
            "      |== / \\ ==|\r\n" + //
            "      |= / _ \\ =|\r\n" + //
            "   _  |=| ( ) |=|\r\n" + //
            "  /=\\ |=|     |=| /=\\\r\n" + //
            "  |=| |=|     |=| |=|\r\n" + //
            "  |=| |=|  _  |=| |=|\r\n" + //
            "  |=| |=| | | |=| |=|\r\n" + //
            "  |=| |=| | | |=| |=|\r\n" + //
            "  |=| |=| | | |=| |=|\r\n" + //
            "  |=| |/  | |  \\| |=|\r\n" + //
            "  |=|/    | |    \\|=|\r\n" + //
            "  |=/NASA |_| NASA\\=|\r\n" + //
            "  |(_______________)|\r\n" + //
            "  |=| |_|__|__|_| |=|\r\n" + //
            "  |=|   ( ) ( )   |=|\r\n" + //
            " /===\\           /===\\\r\n" + //
            "|||||||         |||||||\r\n" + //
            "-------         -------\r\n" + //
            " (~~~)           (~~~)";

    public DeepSpaceShuttle() {
        this.type = "Deep Space Shuttle";
        this.range = "Up to 1M km";
        this.serialNumber = MissionUtils.generateDeepSpaceShuttleSerialNumber();
        this.cargoCapacity = 30;
        this.crewCapacity = 25;
        this.length = 55;
    }

    @Override
    public void printData() {
        System.out.println(
                String.format(
                        "Shuttle %s%ntype: %s%nrange: %s%ncargo capacity: %d tons%ncrew capacity: %d%nlength: %d meters%n",
                        this.serialNumber, this.type, this.range, this.cargoCapacity, this.crewCapacity, this.length));
    }

    @Override
    public void printImage() {
        System.out.println(this.image);
    }
}
