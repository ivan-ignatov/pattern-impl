package facadepattern.misc;

public class ObjectA {
    private String data;

    public ObjectA(String data) {
        this.data = data;
    }

    public void printData() {
        System.out.println(this.data);
    }

    public String getData() {
        return this.data;
    }
}
