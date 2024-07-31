package abstractfactorypattern;

import abstractfactorypattern.creator.MissionAbstractFactory;
import abstractfactorypattern.creator.impl.JupiterMissionFactory;
import abstractfactorypattern.creator.impl.MarsMissionFactory;
import abstractfactorypattern.creator.impl.SaturnMissionFactory;

public class AbstractFactoryRunner {
    public static void main(String[] args) {
        MissionAbstractFactory closeRangeMission = new MarsMissionFactory();
        MissionAbstractFactory mediumRangeMission = new JupiterMissionFactory();
        MissionAbstractFactory longRangeMission = new SaturnMissionFactory();

        closeRangeMission.printData();
        mediumRangeMission.printData();
        longRangeMission.printData();
    }
}
