class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> a1=new ArrayList<>();
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        
        for(int i : nums1){
            set1.add(i);
        }
        
        for(int i : nums2){
            set2.add(i);
        }
        
        for(int a : set1){
            if(set2.contains(a)){
                a1.add(a);
            }
        }
        
        int[] res=new int[a1.size()];
        int k=0;
        for(int a : a1){
            res[k]=a;
            k++;
        }
        return res;
    }
}