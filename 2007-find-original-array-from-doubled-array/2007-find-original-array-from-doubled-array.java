class Solution {
    public int[] findOriginalArray(int[] changed) {
        int clen=changed.length;
        if(clen%2==1 || clen==1)
            return new int[]{};
        Map<Integer, Integer> map=new HashMap<>();
        //find the frequecy of elements in changed array
        for(int i : changed){
            if(!map.containsKey(i))
                map.put(i,0);
            map.put(i,map.get(i)+1);
        }Arrays.sort(changed);
        int index=0;
        int[] arr=new int[clen/2];
        for(int i : changed){
            if(map.getOrDefault(i,0)<=0)
                continue;
            if(map.getOrDefault(i*2,0)<=0){
                return new int[]{};
            }
            arr[index++]=i;
            map.put(i,map.get(i)-1);
            map.put(2*i,map.get(2*i)-1);
        }
        return arr;
    }
}