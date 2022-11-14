class Solution {
    public int removeDuplicates(int[] nums) {
        int count=0;
        HashSet<Integer> set=new LinkedHashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int i=0;
        Iterator<Integer> it=set.iterator();
        while(it.hasNext()){
            nums[i]=it.next();
            i++;
        }
        return set.size();
    }
}