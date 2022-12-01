class Solution {
    public boolean halvesAreAlike(String s) {
        int len=s.length();
        int mid=len/2;
        int firstStringVowels=noOfVowels(0,mid,s);
        int secondStringVowels=noOfVowels(mid,len,s);
        if(firstStringVowels==secondStringVowels)
            return true;
        return false;
    }
    public static int noOfVowels(int start,int end,String str){
        ArrayList<Character> list=new ArrayList<>(Arrays.asList('A','E','I','O','U','a','e','i','o','u'));
        int count=0;
        for(int i=start;i<end;i++){
            if(list.contains(str.charAt(i)))
                count++;
        }
        return count;
    }
}