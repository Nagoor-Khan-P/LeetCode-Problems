class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<ops.length;i++){
            if(ops[i].equals("C")){
            if(!stack.isEmpty()){
                stack.pop();
            }
        }
        else if(ops[i].equals("D")){
            if(!stack.isEmpty()){
                int x=stack.peek();
                stack.add(x*2);
            }
        }
        else if(ops[i].equals("+")){
            if(!stack.isEmpty()){
                int x=stack.pop();
                int y=stack.peek();
                stack.add(x);
                stack.add(x+y);
            }
        }
        else{
            stack.add(Integer.valueOf(ops[i]));
            }
        }
        int sum=0;
        System.out.println(stack.size());
        while(!stack.isEmpty()){
            sum+=stack.pop();
        }
        return sum;
    }
}