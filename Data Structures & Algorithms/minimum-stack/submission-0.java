class MinStack {

    private Stack<Integer> st;

    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
          
          List<Integer> temp= new ArrayList<>();

           int res= Integer.MAX_VALUE;
           while(!st.isEmpty()){
                int tmp=st.pop();
                temp.add(tmp);
                res=Math.min(res,tmp); 
           }

           int i=temp.size()-1;
           while(i>=0){
             st.push(temp.get(i));
             i--;
           }

           return res;
        
    }
}
