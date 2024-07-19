package factorypattern.util;

import java.util.Random;

public class RandomUtils {

    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final Random RANDOM = new Random();

    /**
     * Generates a random size depending on the given game level.
     * 
     * @param gameLevel given game level
     * @return a new random size
     */
    public static Float generateSize(Integer gameLevel) {
        float limit = (float) (gameLevel * 1000.00);

        return RANDOM.nextFloat() * limit;
    }
    
    /**
     * Generates a random name.
     * 
     * @return a new name of the type 'XXXX-XXXX'
     */
    public static String generateName() {
        return randomString(4) + "-" + randomString(4);
    }
    
    private static String randomString(int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(CHARACTERS.charAt(RANDOM.nextInt(CHARACTERS.length())));
        }
        return sb.toString();
    }
}
