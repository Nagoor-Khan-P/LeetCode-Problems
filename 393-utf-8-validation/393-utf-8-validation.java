class Solution {
    public boolean validUtf8(int[] data) {
        int remaingBytes = 0;
        for(int i : data){
            //first case to check how bytes are remaining
            if(remaingBytes == 0){
                if(i>>7 == 0b0)
                    remaingBytes=0;
                else if(i>>5 == 0b110)
                    remaingBytes=1;
                else if(i>>4 == 0b1110)
                    remaingBytes=2;
                else if(i>>3 == 0b11110)
                    remaingBytes=3;
                else
                    return false;
            }
            //from the second bit there should be 10
            else{
                if(i>>6 == 0b10)
                    remaingBytes--;
                else
                    return false;
            }
        }
        if(remaingBytes==0)
            return true;
        return false;
    }
}