class Solution {
    public boolean checkRecord(String s) {
        int Acount=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='P')
                continue;
            else if(s.charAt(i)=='A'){
                Acount++;
                if(Acount>=2){
                    return false;
                }
            }
            else{
                if(i-1>=0 && i+1<s.length()){
                    if(s.charAt(i-1)=='L' && s.charAt(i+1)=='L'){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}