package abstractfactorypattern.creator;

import abstractfactorypattern.products.rocket.Rocket;
import abstractfactorypattern.products.shuttle.Shuttle;

public interface MissionAbstractFactory {

    Shuttle getMissionShuttle();

    Rocket getMissionRocket();

    void printData();

}
