class Solution {
    public int maximalRectangle(char[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int[] heights=new int[col];
        int maxarea=0;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(matrix[i][j]=='1'){
                    heights[j]+=1;
                }else{
                    heights[j]=0;
                }
            }
            maxarea=Math.max(maxarea, findmax(heights));
        }
        return maxarea;
    }
    public int findmax(int[] heights){
        int n=heights.length;
        int maxarea=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0; i<=n; i++){
           int h=(i==n)?0:heights[i];
           while(!st.isEmpty() && h<heights[st.peek()]){
            int height=heights[st.pop()];
            int width=(st.isEmpty())?i:i-st.peek()-1;
            int area=height*width;
            maxarea=Math.max(maxarea, area);
           }
           st.push(i);
        }
        return maxarea;
    }
}