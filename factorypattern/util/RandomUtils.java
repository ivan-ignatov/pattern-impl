package factorypattern.util;

import java.util.Random;

public class RandomUtils {

    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final Random RANDOM = new Random();
    private static final String IMAGE_1 = "                                  ~~.                  \r\n" + //
            "                          .:~77~~~^::                  \r\n" + //
            "                       .!PPJJ?!!!!~777~                \r\n" + //
            "                    .~!JG5J7JJ?77~:~!!!.               \r\n" + //
            "                  ^P555P7~!7YYY?J?~~7~:                \r\n" + //
            "                 :&BB#PJ7!~!7JJ?YYJ!~^. .              \r\n" + //
            "                 BGB@BJ~!?7!~!7777!!~^:..              \r\n" + //
            "                .BPB&GJ~77^~??7~~~!77~::.              \r\n" + //
            "                :B#B#G5PJ!^!777!^~!!~!^                \r\n" + //
            "                 .5##BJ5Y?7!!77!!!^^:^^.               \r\n" + //
            "                   ^GG?7YY7!?~!7J!.                    \r\n" + //
            "                    .~??7J?!~~!77^                     \r\n" + //
            "                      :^^~~:^:                        ";

    private static final String IMAGE_2 = "                  ...  .                          \r\n" + //
            "             .::::^:^^:^~~~!~^~~^^:..             \r\n" + //
            "           :~7??7777?!!!77~!J?JJY5YY??7!:         \r\n" + //
            "        .!YYY5PBBGG5?~7??7!Y5PP5YJ?JJJJ?~!^       \r\n" + //
            "       .J5555PB&#57?!7???YPGPPP55J????7!~YBY.     \r\n" + //
            "      ^JY55Y5PG5J7JJJJJJYPGGGPPP55PPPGGBGGGG?     \r\n" + //
            "     7YY5555P5YYJYYYJJJ?Y5PGGBBGPGPPP55PGGGGG^    \r\n" + //
            "    .55555PP55YJYYYYYYJY55GGPGPPBGP55P5YPPPPGJ    \r\n" + //
            "    !P5Y5P5555YY5555YY5PPPPPPGGGBGPPPPP555YPP5    \r\n" + //
            "    :5YY55555Y5Y55YYJ?Y55PPPPGGGGGGPPPPPPP5PPY    \r\n" + //
            "     ?5YYY555YYY5YYYYYJJJYPPPGGPPPPPPPPGGG5PP~    \r\n" + //
            "     .JYYYYYYYYY5YY55YYJJ?Y5P5PYPPPP5PPPPPPP?     \r\n" + //
            "       ~YPYYYYYYYYYJY55YYYYJYYJJY55YY5YY5Y7:      \r\n" + //
            "        .~Y5YYJJJJJJJ55YYJYJJJ?JJJJJJJJ7^.        \r\n" + //
            "          .~?YJYJJJJ???J7??????7??7!^..           \r\n" + //
            "             ..^~~!!!77!~!^~7!~!~^.    \r\n";

    private static final String IMAGE_3 = "                                     .~.          \r\n" + //
            "                                                  \r\n" + //
            "                             .~JPP5J7^.           \r\n" + //
            "          .:.            .:7P###BGGGGG5Y.         \r\n" + //
            "           .        .~7YPGB##BBBBBGGGG5J^         \r\n" + //
            "                   ?###BGGGGPPPPP5Y555J..         \r\n" + //
            "                  .!PBBBPP55Y5J?77?J?!.           \r\n" + //
            "                ^?GP5GGP5YJ?77!7!?~.              \r\n" + //
            "               :GGBG55JJJJYJ77!!^.                \r\n" + //
            "               .?55J!~:^!!~~::..                  \r\n" + //
            "                  .   . ...                       \r\n";

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

    public static String generateImage() {
        int choice = RANDOM.nextInt(3);

        switch (choice) {
            case 0:
                return IMAGE_1;
            case 1:
                return IMAGE_2;
            case 2:
                return IMAGE_3;
            default:
                return "NO IMAGE DATA\n";
        }
    }
}
