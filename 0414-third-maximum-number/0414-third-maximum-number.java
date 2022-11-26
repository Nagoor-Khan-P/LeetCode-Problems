class Solution {
    public int thirdMax(int[] num) {
        Set<Integer> set=new HashSet<>();
        for(int i: num){
            set.add(i);
        }
        int[] nums=new int[set.size()];
        int j=0;
        for(int i : set){
            nums[j]=i;
            j++;
        }
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length<3){
            return nums[0]>nums[1]?nums[0]:nums[1];
        }
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int max3=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max1){
                max3=max2;
                max2=max1;
                max1=nums[i];
            }
            else if(nums[i]>max2){
                max3=max2;
                max2=nums[i];
            }
            else if(nums[i]>max3){
                max3=nums[i];
            }
        }
        return max3;
    }
}