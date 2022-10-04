class Solution {
    public int firstMissingPositive(int[] nums) {
        int missNum=1;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]>missNum){
                return missNum;
            }
            if(nums[i]==missNum){
                missNum++;
            }
        }
        return missNum;
    }
}