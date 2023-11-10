class Solution {
    public int[] restoreArray(int[][] mat) {
      Map<Integer, List<Integer>> map = new HashMap<>();
      for(int i=0; i<mat.length; i++) {
          if(!map.containsKey(mat[i][0])){
              map.put(mat[i][0], new ArrayList(Arrays.asList(mat[i][1])));
          } else {
              List<Integer> list = map.get(mat[i][0]);
              list.add(mat[i][1]);
              map.put(mat[i][0], list);
          }
          if(!map.containsKey(mat[i][1])){
              map.put(mat[i][1], new ArrayList(Arrays.asList(mat[i][0])));
          } else {
              List<Integer> list = map.get(mat[i][1]);
              list.add(mat[i][0]);
              map.put(mat[i][1], list);
          }
      }
      //find the first element
      List<Integer> res = new ArrayList<>();
      for(Map.Entry<Integer, List<Integer>> entry : map.entrySet()){
          if(entry.getValue().size()==1){
              res.add(entry.getKey());
              res.add(entry.getValue().get(0));
              break;
          }
      }
    System.out.println(map);
    System.out.println(res);
      while(res.size() < mat.length+1) {
          int last = res.get(res.size()-1);
          int prev = res.get(res.size()-2);
          List<Integer> list = map.get(last);
          int nextEl = list.get(0) != prev ? list.get(0) : list.get(1);
          res.add(nextEl);
      }
      
      return res.stream().mapToInt(Integer::intValue).toArray();
    }
}