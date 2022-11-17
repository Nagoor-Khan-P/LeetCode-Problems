class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length()==1)
            return true;
        //if first char is Capital
        if(word.charAt(0)>=65 && word.charAt(0)<=90){
            //if second char is capital
            if(word.charAt(1)>=65 && word.charAt(1)<=90){
                int i=2;
                while(i<word.length()){
                  if(!(word.charAt(i)<=90)){
                    return false;
                    }  
                    i++;
                }
            }
            else if(word.charAt(1)>=97 && word.charAt(1)<=122){
                int j=2;
                while(j<word.length()){
                  if(!(word.charAt(j)>=97)){
                    return false;
                    }  
                    j++;
                }
            }
        }
        //else if first char is small
        else{
            int i=0;
            while(i<word.length()){
                if(!(word.charAt(i)>=97)){
                    return false;
                }
                i++;
            }
        }
        return true;
    }
}