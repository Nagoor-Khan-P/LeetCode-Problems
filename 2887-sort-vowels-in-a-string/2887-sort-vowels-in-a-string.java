class Solution {
    public String sortVowels(String s) {
        List<Character> list = new ArrayList<>();
        for(char ch : s.toCharArray()) {
            if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                list.add(ch);
            }
        }
        Collections.sort(list);
        System.out.println(list);
        int j = 0;
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

                sb.setCharAt(i, list.get(j));
                j++;
            }
        }
        return sb.toString();
    }
} 