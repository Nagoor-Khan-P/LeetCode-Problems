class Solution {
    public int minCost(String str, int[] neededTime) {
        int minTime=0;
        //traverse the string if you found the same consecutive charas then add the min value
        for(int i=1;i<str.length();i++){
            //check if we have consecutive chars
            if(str.charAt(i)==str.charAt(i-1)){
                minTime+=Math.min(neededTime[i],neededTime[i-1]);
                //need to update the neededTime because if the next char is also same and if it
                //greater than previous one then it will again takes than same one
                neededTime[i]=Math.max(neededTime[i],neededTime[i-1]);
            }
        }
        return minTime;
    }
}