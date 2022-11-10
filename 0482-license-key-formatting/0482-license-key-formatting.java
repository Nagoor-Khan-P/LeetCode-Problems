class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb=new StringBuilder();
        
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch!='-'){
                if(ch>=97 && ch<=122){
                    ch=Character.toUpperCase(ch);
                    sb.append(ch);
                    count++;
                }
                else{
                    sb.append(ch);
                    count++;
                }
            }
            if(count==k){
                sb.append('-');
                count=0;
            }
        }
        sb=sb.reverse();
        if(sb.length()>0 && sb.charAt(0)=='-'){
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
}