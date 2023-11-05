class Solution {
    public int getWinner(int[] arr, int k) {
        int n = arr.length;
        if (k == 1) {
            return arr[0] > arr[1] ? arr[0] : arr[1];
        }
        if (k >= n) {
            Arrays.sort(arr);
            return arr[n-1];
        }
        int winner = arr[0];
        int wins = 0;
        for(int i=1; i<n; i++){
            if (winner > arr[i]) {
                wins+=1;
            }
            else {
                winner = arr[i];
                wins = 1;
            }

            if (wins == k) {
                return winner;
            } 
        }
        return winner;
        
    }
}