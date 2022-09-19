class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        List<List<String>> res=new ArrayList<>();
        if(paths.length==0)
            return res;
        Map<String, List<String>> map=new HashMap<>();
        //iterate over the paths array and find dir name filename and content in that file
        for(String path : paths){
            String[] strings=path.split(" ");
            String dirName=strings[0];
            //loop over the given path and add filename and contents
            for(int i=1;i<strings.length;i++){
                int index=strings[i].indexOf("(");
                //take the filename and content from the path
                String content=strings[i].substring(index);
                String fileName=dirName+"/"+strings[i].substring(0,index);
                //we use content as key and store filenames as value to find the duplicate files
                List<String> fileNames=map.getOrDefault(content,new ArrayList<>());
                fileNames.add(fileName);
                //we put contents and their filenames in that path
                map.put(content,fileNames);
                
            }
        }
        //check the duplicates
        for(String key : map.keySet()){
            //if list have greater than 1 tat meas it contains morethan one file with same content
            if(map.get(key).size()>1){
                res.add(map.get(key));
            }
        }
        return res;
    }
}