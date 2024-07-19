package factorypattern;

import java.util.List;

import factorypattern.creator.impl.IronAsteroidFactory;
import factorypattern.product.Asteroid;

public class FactoryRunner {
    public static void main(String[] args) {
            IronAsteroidFactory ironAsteroidFactory = new IronAsteroidFactory();

            Asteroid ironAsteroid = ironAsteroidFactory.createAsteroid(5);
            ironAsteroid.printImage();
            ironAsteroid.printData();

            List<Asteroid> ironAsteroidList = ironAsteroidFactory.createMultipleAsteroids(5, 7);
            
            System.out.println("===================================\n");
            for (Asteroid asteroid : ironAsteroidList) {
                asteroid.printImage();
                asteroid.printData();
                System.out.println("===================================\n");
            }
        }
}
