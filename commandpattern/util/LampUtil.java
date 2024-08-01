package commandpattern.util;

import java.util.Random;

public class LampUtil {
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final Random RANDOM = new Random();

    /**
     * Generates a random serial number for a Lamp.
     * 
     * @return the random serial number
     */
    public static String generateLampSerialNumber() {
        return randomString(3) + "-" + randomString(3);
    }

    private static String randomString(int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(CHARACTERS.charAt(RANDOM.nextInt(CHARACTERS.length())));
        }
        return sb.toString();
    }
}
