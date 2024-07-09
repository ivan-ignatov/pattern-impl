package duck.attributes.display.impl;

import duck.attributes.display.DisplayInterface;

public class GraphicDisplay implements DisplayInterface {

    @Override
    public void display() {
        System.out.println("    __\r\n" + //
                        "___( o)>\r\n" + //
                        "\\ <_. )\r\n" + //
                        " `---' ");
    }
    
}
