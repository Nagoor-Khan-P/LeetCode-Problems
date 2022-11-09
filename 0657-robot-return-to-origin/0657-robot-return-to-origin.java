class Solution {
    public boolean judgeCircle(String moves) {
        int countofU=0;
        int countofD=0;
        int countofL=0;
        int countofR=0;
        for(int i=0;i<moves.length();i++){
            char ch=moves.charAt(i);
            if(ch=='U')
                countofU++;
            if(ch=='D')
                countofD++;
            if(ch=='L')
                countofL++;
            if(ch=='R')
                countofR++;
        }
        
        if(countofU==countofD && countofL==countofR){
            return true;
        }
        
        return false;
    }
}