class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        List<Double> list = new ArrayList<>();
        for(int i=0; i<dist.length; i++){
            list.add(dist[i]/(double)speed[i]);
        }
        System.out.println(list);
        Collections.sort(list);
        double time=0;
        int ans=0;
        for(double t : list) {
            if(t <= time){
                break;
            }
            else{
                ans++;
                time++;
            }
        }
        return ans;
    }
}