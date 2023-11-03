class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> res = new ArrayList<>();
        int ind = 0;
        String PUSH = "Push";
        String POP = "Pop";
        int len = target.length;
        for(int i=1; i<=n; i++) {
            if(ind < len && target[ind] == i) {
                res.add(PUSH);
                ind++;
            }
            else {
                if(ind == len) {
                    break;
                }
                res.add(PUSH);
                res.add(POP);
            }
        }
        return res;
    }
}