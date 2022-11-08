class Solution {
    public String makeGood(String s) {
        if(s.length()==0){
            return s;
        }
        StringBuilder sb=new StringBuilder(s);
        for(int i=1;i<sb.length();i++){
            // if first char is small letter
            if(sb.charAt(i)>=97 && sb.charAt(i)<=122){
                if(sb.charAt(i-1)>=65 && sb.charAt(i-1)<=90){
                    int diff=Math.abs(sb.charAt(i)-sb.charAt(i-1));
                    if(diff==32){
                        sb.deleteCharAt(i);
                        sb.deleteCharAt(i-1);
                        i=0;
                    }
                } 
            }
            //if first char is captital letter
            else if(sb.charAt(i)>=65 && sb.charAt(i)<=90){
                if(sb.charAt(i-1)>=97 && sb.charAt(i-1)<=122){
                   int diff=Math.abs(sb.charAt(i)-sb.charAt(i-1)); 
                    if(diff==32){
                        sb.deleteCharAt(i);
                        sb.deleteCharAt(i-1);
                        i=0;
                    }
                }
            }
        }
        return sb.toString();
    }
}