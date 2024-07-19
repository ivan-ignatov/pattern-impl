package factorypattern.creator.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import factorypattern.creator.AsteroidFactory;
import factorypattern.product.Asteroid;
import factorypattern.product.impl.IronAsteroid;
import factorypattern.util.RandomUtils;

public class IronAsteroidFactory implements AsteroidFactory {

    @Override
    public Asteroid createAsteroid(Integer gameLevel) {
        IronAsteroid asteroid = new IronAsteroid();
        addAsteroidSize(asteroid, gameLevel);
        addAsteroidName(asteroid);
        addAsteroidImage(asteroid);
        
        return asteroid;
    }
    
    @Override
    public List<Asteroid> createMultipleAsteroids(Integer gameLevel, Integer count) {
        List<Asteroid> asteroids = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            asteroids.add(createAsteroid(gameLevel));
        }
    
        return asteroids;
    }

    private void addAsteroidSize(IronAsteroid asteroid, Integer gameLevel) {
        Float size = RandomUtils.generateSize(gameLevel);
        
        asteroid.setSize(size);
    }
    
    private void addAsteroidName(IronAsteroid asteroid) {
        String name = RandomUtils.generateName();

        asteroid.setName(name);
    }
    
    private void addAsteroidImage(IronAsteroid asteroid) {
        
        asteroid.setImage(RandomUtils.generateImage());
    }
}
