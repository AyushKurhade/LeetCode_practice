import java.util.*;
class Solution {
    
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public long gcdSum(int[] nums) {
        int n = nums.length;
        int[] pgd = new int[n];   // prefixGcd array
        int large = nums[0];      // ab tak ka maximum number

        
        for (int i = 0; i < n; i++) {
            large = Math.max(large, nums[i]);   // ab tak ka max update karo
            pgd[i] = gcd(nums[i], large);       // current element aur max ka gcd
        }

        
        Arrays.sort(pgd);

        
        int l = 0;
        int r = n - 1;
        long sum = 0;

        while (l < r) {
            sum += gcd(pgd[l], pgd[r]);  // pair ka gcd me add  
            l++;
            r--;
        }


        return sum;
    }
}
