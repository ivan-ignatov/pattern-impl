package facadepattern.misc;

public class ObjectC {

    private String data;

    public ObjectC(ObjectA objectA, ObjectB objectB) {
        this.data = objectA.getData() + ". " + objectB.getData();
    }

    public void printData() {
        System.out.println(this.data);
    }

    public String getData() {
        return this.data;
    }
}