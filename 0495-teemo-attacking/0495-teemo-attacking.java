class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int ans=duration;
        for(int i=1;i<timeSeries.length;i++){
            if(timeSeries[i-1]+duration-1<timeSeries[i]){
                ans+=duration;
            }
            else{
                ans=ans+timeSeries[i]-timeSeries[i-1];
            }
        }
        return ans;
    }
}