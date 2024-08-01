package facadepattern.facade;

import facadepattern.misc.ObjectA;
import facadepattern.misc.ObjectB;
import facadepattern.misc.ObjectC;
import facadepattern.misc.ObjectD;

public class Facade {

    private ObjectA objectA;
    private ObjectB objectB;
    private ObjectC objectC;
    private ObjectD objectD;

    public Facade() {
        objectA = new ObjectA("Adaptation");
        objectB = new ObjectB("Benefit");
        objectC = new ObjectC(objectA, objectB);
        objectD = new ObjectD(objectA, objectC);
    }

    public void printData() {
        System.out.print("Printing object A: ");
        objectA.printData();

        System.out.print("Printing object B: ");
        objectB.printData();

        System.out.print("Printing object C: ");
        objectC.printData();

        System.out.print("Printing object D: ");
        objectD.printData();
    }
}
