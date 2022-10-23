class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] res=new int[2];
        //find duplicate
        HashSet<Integer> set=new HashSet<>();
        for(int i : nums){
            if(set.contains(i)){
                res[0]=i;
            }
            set.add(i);
        }
        // find missing
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)){
                res[1]=i;
            }
        }
        return res;
    }
}