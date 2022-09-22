class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        for(int i=0;i<arr.length;i++){
            String temp=arr[i];
            arr[i]=reverseString(temp);
        }
        String res="";
        for(int i=0;i<arr.length;i++){
            res+=arr[i];
            res+=" ";
        }
        return res.trim();
    }
    
    public String reverseString(String s) {
        int start=0;
        char[] arr=s.toCharArray();
        int end=arr.length-1;
        while(start<end){
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return String.valueOf(arr);
    }
}