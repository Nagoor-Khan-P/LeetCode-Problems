class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int score=0;
        int i=0,j=tokens.length-1;
        while(i<=j){
            if(power>=tokens[i]){
                power-=tokens[i];
                score++;
                i++;
            }
            else{
                if(score>0 && i!=j){
                    power+=tokens[j];
                    score--;
                }
                 j--;
            }
        }
        return score;
    }
}