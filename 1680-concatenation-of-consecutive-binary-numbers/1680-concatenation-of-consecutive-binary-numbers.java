class Solution {
    public int concatenatedBinary(int n) {
        long res=0;
        long m=1000000007;
        for(int i=1;i<=n;i++){
            String s=Integer.toBinaryString(i);
            res=(res << s.length())%m;
            res=(res+i)%m;
        }
        return (int)res;
    }
}