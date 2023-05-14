package FirstBadVersion;

import java.util.Arrays;
import java.util.Random;

public class ArrayAPI {
    ArrayAPI() {
        array = generateRandomBooleanArray();
    }

    static ArrayAPI instance;
    static boolean[] array;
    public static int length;

    public static void printArray() {
        if (instance == null)
            instance = new ArrayAPI();
        System.out.println(Arrays.toString(array));
    }

    public static boolean[] generateRandomBooleanArray() {
        Random random = new Random();
        int maxLength = 10;
        int minLength = 5;
        length = random.nextInt(maxLength - minLength + 1) + minLength;
        boolean[] array = new boolean[length];

        // Generate random number of true values
        int trueCount = 1 + random.nextInt(length - 1);
        Arrays.fill(array, 0, trueCount, true);
        return array;
    }

    public static boolean isBadVersion(int index) {
        return array[index];
    }
}
