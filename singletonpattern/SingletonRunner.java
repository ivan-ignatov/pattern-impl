package singletonpattern;

import singletonpattern.singleton.ResourceManager;

public class SingletonRunner {
    public static void main(String[] args) {
        ResourceManager manager = ResourceManager.getInstance();
        manager.takeResources(100);

        System.out.println("Taking 100 resources. Currently free: " + manager.getAvailableResources());

        manager.freeResources(464);
        System.out.println("Added 464 resources. Currently free: " + manager.getAvailableResources());

        System.out.println("Taking 1500 resources.");
        manager.takeResources(1500);
    }
}
