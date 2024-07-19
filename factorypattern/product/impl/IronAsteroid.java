package factorypattern.product.impl;

import factorypattern.product.Asteroid;

public class IronAsteroid implements Asteroid {

    private Float size;
    private String name;
    private String type;
    private String image;

    public IronAsteroid() {
        this.type = "Iron Asteroid";
    }

    @Override
    public void printData() {
        System.out.println(
                String.format("Asteroid %s:\ntype: %s\nsize: %.2f meters\n", this.name, this.type, this.size));
    }
    
    @Override
    public void printImage() {
        System.out.println(this.image);
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

    /**
     * @return String return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(String image) {
        this.image = image;
    }

}
