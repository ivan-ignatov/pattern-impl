package factorypattern.creator;

import java.util.List;

import factorypattern.product.Asteroid;

public interface AsteroidFactory {
    
    /**
     * Creates an asteroid for a given game level.
     * 
     * @param gameLevel level of the game
     * @return a new asteroid
     */
    Asteroid createAsteroid(Integer gameLevel);
   
    /**
     * Creates a number of asteroids for a given game level.
     * 
     * @param gameLevel level of the game
     * @param count number of asteroids to be created
     * @return a list of new asteroids
     */
    List<Asteroid> createMultipleAsteroids(Integer gameLevel, Integer count);

}
