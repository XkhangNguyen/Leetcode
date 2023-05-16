public class SearchInsert {
    public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        if (target > nums[nums.length - 1])
            return nums.length;
        else if (target < nums[0])
            return 0;

        while (left <= right) {
            int middleIndex = left + (right - left) / 2;
            int mid = nums[middleIndex];

            if (mid == target)
                return middleIndex;
            else if (mid > target) {
                if (target <= nums[middleIndex - 1])
                    right = middleIndex;
                else
                    return middleIndex;
            } else if (mid < target) {
                if (target >= nums[middleIndex + 1])
                    left = middleIndex + 1;
                else
                    return middleIndex + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { -1, 0, 3, 5, 9, 12, 13 };
        int target = 15;
        System.out.println(searchInsert(nums, target));
    }
}
