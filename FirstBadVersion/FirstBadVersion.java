package FirstBadVersion;

public class FirstBadVersion {
    public static int firstBadVersion(int n) {
        int left = 0;
        int right = ArrayAPI.length - 1;

        while (left <= right) {
            int middleIndex = left + (right - left) / 2;

            if (!ArrayAPI.isBadVersion(middleIndex) && ArrayAPI.isBadVersion(middleIndex - 1))
                return middleIndex;
            else if (!ArrayAPI.isBadVersion(middleIndex))
                right = middleIndex;
            else
                left = middleIndex + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayAPI.printArray();
        System.out.println(firstBadVersion(ArrayAPI.length));
    }

}
