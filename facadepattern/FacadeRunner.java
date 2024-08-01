package facadepattern;

import facadepattern.facade.Facade;

public class FacadeRunner {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.printData();
    }
}
