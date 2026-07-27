class Solution {
    public int[] sortColors(int[] nums) {
           int n=nums.length;
        int count1=0;
        int count2=0;
        int count3=0;
//        int[] arr2=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                count1++;
            }
            else if(nums[i]==1){
                count2++;
            }
            else{
                count3++;
            }

        }
        int i=0;
        while(count1!=0){
            nums[i]=0;
            i++;
            count1--;
        }
        while(count2!=0){
            nums[i]=1;
            i++;
            count2--;

        }
        while(count3!=0){
            nums[i]=2;
            i++;
            count3--;
        }
        return nums;
    }
}