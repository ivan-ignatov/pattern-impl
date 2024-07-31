package singletonpattern.singleton;

public class ResourceManager {

    private static ResourceManager instance;
    private static Integer availableResources;

    private ResourceManager() {
        availableResources = 1024;
    }

    public static ResourceManager getInstance() {
        if (instance == null) {
            instance = new ResourceManager();
        }

        return instance;
    }

    public static Integer getAvailableResources() {
        return availableResources;
    }

    public static void takeResources(Integer load) {
        if (availableResources - load < 0) {
            System.out.println("Not enough resources. Missing " + Math.abs(availableResources - load));
            availableResources = 0;
        }
        availableResources = availableResources - load;
    }

    public static void freeResources(Integer load) {
        availableResources = availableResources + load;
    }
}
