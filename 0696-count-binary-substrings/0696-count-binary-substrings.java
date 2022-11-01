class Solution {
    public int countBinarySubstrings(String s) {
        int prev=0;
        int cur=1;
        int res=0;
        
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                res+=Math.min(prev,cur);
                prev=cur;
                cur=1;
            }
            else{
                cur++;//count the occurence of 0 or 1
            }
        }
        return res+Math.min(prev,cur);
    }
}