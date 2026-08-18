class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();

        int sum = 0;

        for(String s : operations){
           
           if(s.equals("C")){

             st.pop();
            
           }
           else if(s.equals("D")){
             int x = st.peek();
             st.push(x*2);
             
           }
           else if(s.equals("+")){

            int x = st.pop();
            int y = st.pop();

            int z = x+y;
            st.push(y);
            st.push(x);
            st.push(z);
           }
           else{
            st.push(Integer.parseInt(s));
           }
        }
      
      while(!st.empty()){
         
         int x = st.pop();

         sum+=x;

      }
    
    return sum;
        
    }
}