class Solution {
    public String[] findWords(String[] words) {
        List<String> res=new ArrayList<>();
        List<Character> firstRow=Arrays.asList('q','w','e','r','t','y','u','i','o','p','Q','W','E','R','T','Y','U','I','O','P');
        List<Character> secondRow=Arrays.asList('A','S','D','F','G','H','J','K','L','a','s','d','f','g','h','j','k','l');
        List<Character> thirdRow=Arrays.asList('Z','X','C','V','B','N','M','z','x','c','v','b','n','m');
        for(int i=0;i<words.length;i++){
            String word=words[i];
            int j=0;
            int k=0;
            int l=0;
            if(firstRow.contains(word.charAt(j++))){
                boolean flag=true;
                while(j<word.length()){
                    if(!firstRow.contains(word.charAt(j++))){
                        flag=false;
                    }
                }
                if(flag){
                    res.add(word);
                }
            }
            else if(secondRow.contains(word.charAt(k++))){
                System.out.println("Hii");
                boolean flag=true;
                while(k<word.length()){
                    if(!secondRow.contains(word.charAt(k++))){
                        flag=false;
                        System.out.println("Hii");
                    }
                }
                if(flag){
                    System.out.println("Hello");
                    res.add(word);
                }
            }
            else if(thirdRow.contains(word.charAt(l++))){
                boolean flag=true;
                while(l<word.length()){
                    if(!thirdRow.contains(word.charAt(l++))){
                        flag=false;
                    }
                }
                if(flag){
                    res.add(word);
                }
            }
        }
        int i=0;
        String[] ans=new String[res.size()];
        for(String str: res){
            ans[i++]=str;
        }
        return ans;
    }
}