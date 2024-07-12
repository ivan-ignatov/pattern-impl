package strategypattern.strategies.displaying.impl;

import strategypattern.strategies.displaying.DisplayingStrategy;

public class GraphicDisplaying implements DisplayingStrategy {

    @Override
    public void display() {
        System.out.println("    __\r\n" + //
                        "___( o)>\r\n" + //
                        "\\ <_. )\r\n" + //
                        " `---' ");
    }
    
}
