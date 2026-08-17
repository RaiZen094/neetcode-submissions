class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> st = new Stack<>();
        int res=Integer.parseInt(tokens[0]);
        for(int i=0;i<tokens.length;i++){

           if(tokens[i].equals("+")|| tokens[i].equals("-")
           || tokens[i].equals("*") ||tokens[i].equals("/")){

            int op2=st.pop();
            int op1=st.pop();
            
            switch(tokens[i]){
            
            case "+":
                res=op1+op2;
                break;
            case "-":
                res=op1-op2;
                break;
            case "*":
                res=op1*op2;
                break;
            case "/":
                res=op1/op2;
                break;
            default:
                break;
            }
             
            st.push(res);

           }

           else{

              st.push(Integer.parseInt(tokens[i]));
           }
             

        }

        return res;
        
    }
}
