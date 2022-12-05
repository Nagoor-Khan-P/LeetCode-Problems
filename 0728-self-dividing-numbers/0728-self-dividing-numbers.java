class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<>();
        while(left<=right){
            if(isSelfDividing(left))
                list.add(left);
            left++;
        }
        return list;
    }
    public static boolean isSelfDividing(int num){
        int dpNum=num;
        while(dpNum>0){
            int rem=dpNum%10;
            if(rem==0)
                return false;
            else if(num%rem!=0){
                return false;
            }
            dpNum=dpNum/10;
        }
        return true;
    }
}