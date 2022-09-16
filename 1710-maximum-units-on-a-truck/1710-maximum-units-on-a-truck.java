class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        //need to sort based on the units
        Arrays.sort(boxTypes,(p1,p2)-> p2[1]-p1[1]);
        int count=0;
        for(int i=0;i<boxTypes.length;i++){
            if(truckSize<=0)
                break;
            if(boxTypes[i][0]<=truckSize){
                int units=boxTypes[i][0]*boxTypes[i][1];
                count+=units;
                truckSize-=boxTypes[i][0];
            }
            else if(boxTypes[i][0]>=truckSize){
                int units=truckSize*boxTypes[i][1];
                count+=units;
                break;
            }
        }
        return count;
    }
}