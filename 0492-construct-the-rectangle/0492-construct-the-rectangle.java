class Solution {
    public int[] constructRectangle(int area) {
        int[] res=new int[2];
        for(int i=(int)Math.sqrt(area);i>=1;i--){
            if(area%i==0){
                res[0]=Math.max(i,area/i);
                res[1]=Math.min(i,area/i);
                return res;
            }
        }
        res[0]=area;
        res[1]=1;
        return res;
    }
}