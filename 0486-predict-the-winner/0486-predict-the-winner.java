class Solution {
    public boolean predictTheWinner(int[] nums) {
        return maxDiff(nums, 0, nums.length - 1) >= 0;
    }

    private int maxDiff(int[] nums, int L, int R) {
        if (L == R) return nums[L];

        int takeL = nums[L] - maxDiff(nums, L + 1, R);
        int takeR = nums[R] - maxDiff(nums, L, R - 1);

        return Math.max(takeL, takeR);
    }
}
