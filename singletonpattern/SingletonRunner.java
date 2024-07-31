package singletonpattern;

import singletonpattern.singleton.ResourceManager;

public class SingletonRunner {
    public static void main(String[] args) {
        ResourceManager manager = ResourceManager.getInstance();
        manager.takeResources(100);

        System.out.println("The system currently has " + manager.getAvailableResources() + " free resources.\n");

        manager.freeResources(464);
        System.out.println("The system currently has " + manager.getAvailableResources() + " free resources.\n");

        System.out.println("Taking 1500 resources.");
        manager.takeResources(1500);
    }
}
