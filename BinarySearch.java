class BinarySearch {
    public static int search(int[] nums, int target) {
        int middleIndex = 0;
        int mid = 0;

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            middleIndex = left + (-left + right) / 2;

            mid = nums[middleIndex];

            // System.out.println(middleIndex + " - " + mid);

            if (target == mid)
                return middleIndex;
            else if (target > mid)
                left = middleIndex + 1;
            else
                right = middleIndex - 1;
        }

        return -1;

    }

    public static void main(String[] args) {
        int[] nums = { -1, 0, 3, 5, 9, 12, 13 };
        int target = 0;
        int index = search(nums, target);
        System.out.println("Element " + target + " found at index: " + index);
    }
}