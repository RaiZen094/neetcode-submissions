class Solution {
    public int maxArea(int[] heights) {

        int area=0;
        int tmp;
        int i=0;
        int j=heights.length-1;
        while(i!=j){

          tmp=(j-i)*Math.min(heights[i],heights[j]);

          area=Math.max(area,tmp);

          if(heights[i]<heights[j]){
             i++;
          }
          else
             j--;
       }
              return area;
    }
}
