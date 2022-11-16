/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int start=1;
        int end=n;
        while(start<=end){
            int num=start+(end-start)/2;
            //System.out.println(num);
            int res=guess(num);
            if(res==0)
                return num;
            else if(res==-1){
                end=num-1;
            }
            else if(res==1){
                start=num+1;
            }
        }
        return 1;
    }
}