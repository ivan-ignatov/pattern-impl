package observerpattern.display.impl;

import observerpattern.display.IDisplay;
import observerpattern.observer.IObserver;

public class PhoneDisplay implements IDisplay, IObserver {

    private String phoneModel;

    @Override
    public void display() {
        System.out.println(
                "                          .--.\r\n" + //
                "            " + phoneModel + "  |  |\r\n" + //
                "                          |  |\r\n" + //
                "                          |  |\r\n" + //
                "                          |  |\r\n" + //
                "         _.-----------._  |  |\r\n" + //
                "      .-'      __       `-.  |\r\n" + //
                "    .'       .'  `.        `.|\r\n" + //
                "   ;         :    :          ;\r\n" + //
                "   |         `.__.'          |\r\n" + //
                "   |   ___                   |\r\n" + //
                "   |  (_M_) M O T O R A L A  |\r\n" + //
                "   | .---------------------. |\r\n" + //
                "   | |                     | |\r\n" + //
                "   | |         __   _      | |\r\n" + //
                "   | |       _(  )_( )_    | |\r\n" + //
                "   | |      (_   _    _)   | |\r\n" + //
                "   | |     / /(_) (__)     | |\r\n" + //
                "   | |    / / / / / /      | |\r\n" + //
                "   | |   / / / / / /       | |\r\n" + //
                "   | `---------------------' |\r\n" + //
                "   |                         |\r\n" + //
                "   |                __       |\r\n" + //
                "   |  ________  .-~~__~~-.   |\r\n" + //
                "   | |___C___/ /  .'  `.  \\  |\r\n" + //
                "   |  ______  ;   : OK :   ; |\r\n" + //
                "   | |__A___| |  _`.__.'_  | |\r\n" + //
                "   |  _______ ; \\< |  | >/ ; |\\r\\n");
    }
    
    public void update() {
        display();
    }

    public PhoneDisplay(String phoneModel) {
        this.phoneModel = phoneModel;
    }

    public String getPhoneModel() {
        return phoneModel;
    }

    public void setPhoneModel(String phoneModel) {
        this.phoneModel = phoneModel;
    }
}
