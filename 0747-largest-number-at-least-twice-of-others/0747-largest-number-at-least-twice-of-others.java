class Solution {
    public int dominantIndex(int[] nums) {
        //find the maxfirst
        int max=nums[0];
        int ind=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                ind=i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==max)
                continue;
            if(nums[i]+nums[i]>max)
                return -1;
        }
        return ind;
    }
}