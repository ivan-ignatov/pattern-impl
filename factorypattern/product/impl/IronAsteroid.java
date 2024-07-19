package factorypattern.product.impl;

import factorypattern.product.Asteroid;

public class IronAsteroid implements Asteroid {

    private Float size;
    private String name;
    private String type;

    public IronAsteroid() {
        this.type = "Iron Asteroid";
    }

    @Override
    public void printData() {
        System.out.println(
                String.format("Asteroid data:\ntype: %s\nname: %s\nsize: %.2f\n", this.type, this.name, this.size));
    }
    
    /**
     * @return Float return the size
     */
    public Float getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(Float size) {
        this.size = size;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

}
