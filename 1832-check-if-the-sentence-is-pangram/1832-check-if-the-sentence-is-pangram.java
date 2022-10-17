class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] alphabets=new int[256];
        for(int i=0;i<sentence.length();i++){
            alphabets[sentence.charAt(i)]++;
        }
        
        for(int i=97;i<=122;i++){
            if(alphabets[i]==0)
                return false;
        }
        return true;
    }
}