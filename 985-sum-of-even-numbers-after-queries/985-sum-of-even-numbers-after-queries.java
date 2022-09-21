class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int len=nums.length;
        int[] res=new int[queries.length];
        //find the sum of even number in the nums
        int evenSum=0;
        for(int i=0;i<len;i++){
            if(nums[i]%2==0)
                evenSum+=nums[i];
        }
        
        //traverse the queries and update the res array
        int index;
        for(int i=0;i<queries.length;i++){
            index=queries[i][1];
            
            //if nums is already a even number then subtract that from evenSum
            if(nums[index]%2==0){
                evenSum-=nums[index];
            }
            
            //now update the numsber with query value
            
            nums[index]+=queries[i][0];
            if(nums[index]%2==0){
                evenSum+=nums[index];
            }
            
            res[i]=evenSum;
        }
        
        return res;
    }
}