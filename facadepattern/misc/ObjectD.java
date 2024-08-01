package facadepattern.misc;

public class ObjectD {
    private String data;

    public ObjectD(ObjectA objectA, ObjectC objectC) {
        this.data = objectA.getData() + ". " + objectC.getData();
    }

    public void printData() {
        System.out.println(this.data);
    }
}
