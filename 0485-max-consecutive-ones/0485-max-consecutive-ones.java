class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int maxLength=Integer.MIN_VALUE;
        for(int i: nums){
            if(i==1){
                count++;
            }
            else if(i!=1){
                maxLength=Math.max(maxLength,count);
                count=0;
            }
        }
        maxLength=Math.max(maxLength,count);
        return maxLength;
    }
}