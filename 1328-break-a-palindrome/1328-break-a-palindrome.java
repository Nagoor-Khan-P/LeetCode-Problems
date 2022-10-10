class Solution {
    public String breakPalindrome(String palindrome) {
        char[] arr=palindrome.toCharArray();
        int n=arr.length;
        boolean flag=false;
        if(n==1){
            return "";
        }
        //we need to return the lexicographically smaller string
        //so if we found the a we just continue to next iteration
        // if we find any other then we willl make it as a then return
        for(int i=0;i<n/2;i++){
            if(arr[i]=='a')
                continue;
            arr[i]='a';
            flag=true;
            break;
        }
        //case: if a string contains all the a's then make last index element as b
        if(!flag){
            arr[n-1]='b';
        }
        return new String(arr);
    }
}