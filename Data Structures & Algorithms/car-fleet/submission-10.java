class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        int[][] cars = new int[position.length][2];

        Stack<Double> st = new Stack<>();

        int res=0;

        for(int i=0;i<position.length;i++){

         cars[i][0]=position[i];
         cars[i][1]=speed[i];
        }

        Arrays.sort(cars,(a,b)->Integer.compare(b[0],a[0]));

        for(int i=0; i<position.length;i++){

               double time = (double)(target-cars[i][0])/(cars[i][1]);

               if(st.isEmpty()){
                st.push(time);
                continue;
               }    

               if(time>st.peek()){
                
                 st.push(time);
                

               }
                 
               else
                 continue;
                 

        }

             return st.size();

        
    }
}
