class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set=new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int i=0;
        for(Integer e:set){
            nums[i++]=e;
        }
        return set.size();
    }
}