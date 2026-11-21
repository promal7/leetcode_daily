class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int[] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        ans[n-1]=0;
        for(int i=n-1; i>=0; i--){
            while(!st.isEmpty() && temperatures[st.peek()]<=temperatures[i]){
                st.pop();
            }
            if(!st.isEmpty() && temperatures[st.peek()]> temperatures[i]){
                int previousind=st.peek();
                ans[i]=previousind-i;
            }
            st.push(i);
        }
        return ans;
    }
}