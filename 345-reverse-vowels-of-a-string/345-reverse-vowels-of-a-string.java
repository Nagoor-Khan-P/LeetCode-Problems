class Solution {
    public String reverseVowels(String s) {
        //two pointers approch
        int low=0;
        int high=s.length()-1;
        List<Character> list=Arrays.asList('a','e','i','o','u','A','E','I','O','U');
        char[] arr=s.toCharArray();
        while(low<high){
            char lch=arr[low];
            char rch=arr[high];
            if(list.contains(lch) && list.contains(rch)){
                char temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
                low++;
                high--;
            }
            if(!list.contains(lch))
                low++;
            if(!list.contains(rch)){
                high--;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}