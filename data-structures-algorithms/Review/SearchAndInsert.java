package Review;

class SearchAndInsert {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return start;
    }

    public static void main(String[] args) {
        SearchAndInsert obj = new SearchAndInsert();

        int[] nums1 = {1, 3, 5, 6};
        int target1 = 5;

        int[] nums2 = {1, 3, 5, 6};
        int target2 = 2;

        int[] nums3 = {1, 3, 5, 6};
        int target3 = 7;

        System.out.println(obj.searchInsert(nums1, target1)); // 2
        System.out.println(obj.searchInsert(nums2, target2)); // 1
        System.out.println(obj.searchInsert(nums3, target3)); // 4
    }
}