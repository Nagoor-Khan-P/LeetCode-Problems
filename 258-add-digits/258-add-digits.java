class Solution {
    public int addDigits(int num) {
        int len=Integer.toString(num).length();
        if(len==1)
            return num;
        num=digitSum(num);
        return addDigits(num);
    }
    public static int digitSum(int num){
        int sum=0;
        while(num>0){
            int res=num%10;
            sum+=res;
            num=num/10;
        }
        System.out.println(sum);
        return sum;
    }
}