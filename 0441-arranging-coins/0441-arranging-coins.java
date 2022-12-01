class Solution {
    public int arrangeCoins(int n) {
        int count=0;
        for(int i=1;i<=n && n>0;i++){
            if(n>=i && n-i>=0){
                n-=i;
                count++;
            }
            else
                break;
        }
        return count;
    }
}