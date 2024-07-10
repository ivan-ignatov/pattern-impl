package attributes.display.impl;

import attributes.display.DisplayInterface;

public class GraphicDisplay implements DisplayInterface {

    @Override
    public void display() {
        System.out.println("    __\r\n" + //
                        "___( o)>\r\n" + //
                        "\\ <_. )\r\n" + //
                        " `---' ");
    }
    
}
