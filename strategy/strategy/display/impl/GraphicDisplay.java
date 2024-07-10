package strategy.display.impl;

import strategy.display.DisplayStrategy;

public class GraphicDisplay implements DisplayStrategy {

    @Override
    public void display() {
        System.out.println("    __\r\n" + //
                        "___( o)>\r\n" + //
                        "\\ <_. )\r\n" + //
                        " `---' ");
    }
    
}
