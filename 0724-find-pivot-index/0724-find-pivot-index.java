class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int total = 0;

        for (int a : nums) {
            total = total + a;
        }

        int left = 0;

        for (int i = 0; i < n; i++) {
            if (left == total - left - nums[i]) {
                return i;
            }

            left = left + nums[i];
        }

        return -1;
    }
}