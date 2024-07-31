package abstractfactorypattern.products.shuttle.impl;

import abstractfactorypattern.products.shuttle.Shuttle;
import abstractfactorypattern.utils.MissionUtils;

public class SpaceShuttle implements Shuttle {

    private String type;
    private String range;
    private String serialNumber;
    private Integer cargoCapacity;
    private Integer crewCapacity;
    private Integer length;

    private String image = "\n" + //
            "                /  \\\r\n" + //
            "              /      \\\r\n" + //
            "            /          \\\r\n" + //
            "           |     /\\     |\r\n" + //
            "           |    /  \\    |\r\n" + //
            "           |   /    \\   |\r\n" + //
            "           |  | (  ) |  |\r\n" + //
            "           |  | (  ) |  |\r\n" + //
            "           |  |      |  |\r\n" + //
            "           |  |      |  |\r\n" + //
            "           |  |      |  |\r\n" + //
            "           | /|   .  |\\ |\r\n" + //
            "           /  |   .  |  \\\r\n" + //
            "         /    |   .  |    \\\r\n" + //
            "       /      |   .  |      \\\r\n" + //
            "     /        |   .  |        \\\r\n" + //
            "   /   NASA   |   .  |  NASA    \\\r\n" + //
            "   (          |      |          )\r\n" + //
            "    |   |  |--|      |--| |    |\r\n" + //
            "     /  \\-----/  \\/  \\-----/  \\\r\n" + //
            "     \\\\//     \\\\//\\\\//     \\\\//\r\n" + //
            "      \\/       \\/  \\/       \\/\n";

    public SpaceShuttle() {
        this.type = "Space Shuttle";
        this.range = "Up to 250k km";
        this.serialNumber = MissionUtils.generateSpaceShuttleSerialNumber();
        this.cargoCapacity = 15;
        this.crewCapacity = 7;
        this.length = 32;
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
