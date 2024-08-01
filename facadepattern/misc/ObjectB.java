package facadepattern.misc;

public class ObjectB {
    private String data;

    public ObjectB(String data) {
        this.data = data;
    }

    public void printData() {
        System.out.println(this.data);
    }

    public String getData() {
        return this.data;
    }
}
