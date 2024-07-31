package abstractfactorypattern.creator.impl;

import abstractfactorypattern.creator.MissionAbstractFactory;
import abstractfactorypattern.products.rocket.Rocket;
import abstractfactorypattern.products.rocket.impl.CloseRangeRocket;
import abstractfactorypattern.products.shuttle.Shuttle;
import abstractfactorypattern.products.shuttle.impl.SpaceShuttle;
import abstractfactorypattern.utils.MissionUtils;

public class MarsMissionFactory implements MissionAbstractFactory {

    private String designation;
    private String name;
    private Rocket rocket;
    private Shuttle shuttle;
    private String timePeriod;
    private String distance;
    private Integer crewMembers;

    public MarsMissionFactory() {
        this.designation = MissionUtils.generateMissionDesignation();
        this.name = "Mars Close Range Mission";
        this.rocket = new CloseRangeRocket();
        this.shuttle = new SpaceShuttle();
        this.timePeriod = "75 days";
        this.distance = "136M km";
        this.crewMembers = 7;
    }

    @Override
    public Shuttle getMissionShuttle() {
        return this.shuttle;
    }

    @Override
    public Rocket getMissionRocket() {
        return this.rocket;
    }

    @Override
    public void printData() {
        System.out.println(
                String.format(
                        "Name: %s%ndesignation: %s%ndistance: %s%ntime: %s%ncrew members: %s",
                        this.name, this.designation, this.distance, this.timePeriod, this.crewMembers));
        this.rocket.printImage();
        this.rocket.printData();
        this.shuttle.printImage();
        this.shuttle.printData();
    }

}
