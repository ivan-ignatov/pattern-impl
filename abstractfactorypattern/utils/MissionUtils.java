package abstractfactorypattern.utils;

import java.util.Random;

public class MissionUtils {

    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final Random RANDOM = new Random();

    /**
     * Generates a random serial number for a Space Shuttle.
     * 
     * @return the random serial number
     */
    public static String generateSpaceShuttleSerialNumber() {
        return "STS-" + randomString(4) + "-" + randomString(6);
    }

    /**
     * Generates a random serial number for a Deep Space Shuttle.
     * 
     * @return the random serial number
     */
    public static String generateDeepSpaceShuttleSerialNumber() {
        return "DSTS-" + randomString(3) + "-" + randomString(3) + ":" + randomString(3);
    }

    /**
     * Generates a random serial number for a Close Range Rocket.
     * 
     * @return the random serial number
     */
    public static String generateCloseRangeRocketSerialNumber() {
        return "CRC: " + randomString(4) + "-" + randomString(2) + "/" + randomString(2);
    }

    /**
     * Generates a random serial number for a Long Range Rocket.
     * 
     * @return the random serial number
     */
    public static String generateLongRangeRocketSerialNumber() {
        return "DSLRC: " + randomString(2) + "." + randomString(2) + "." + randomString(2) + "." + randomString(4);
    }

    /**
     * Generates a random serial number for a Space Mission Designation.
     * 
     * @return the random serial number
     */
    public static String generateMissionDesignation() {
        return randomString(3) + "-" + randomString(3) + "-" + randomString(3) + "-" + randomString(3);
    }

    private static String randomString(int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(CHARACTERS.charAt(RANDOM.nextInt(CHARACTERS.length())));
        }
        return sb.toString();
    }
}
