class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        int num=0;
        int n=tokens.length;
        for(String t: tokens){
            if(t.equals("+") || t.equals("*") || t.equals("-") || t.equals("/")){
                int b=st.pop();
                int a=st.pop();
                if(t.equals("+")){
                    st.push(a+b);
                }
                else if(t.equals("-")){
                    st.push(a-b);
                }
                else if(t.equals("*")){
                    st.push(a*b);
                }
                else if(t.equals("/")){
                    st.push(a/b);
                }
            }else{
                st.push(Integer.parseInt(t));
            }
        }
        return st.peek();
    }
}