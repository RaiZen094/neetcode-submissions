class Solution {
    public boolean isOpen(Character c){

                  if(c =='('||c=='{'||c=='[')
                        return true;

                  else 
                       return false;
        }

     public boolean isClose(Character c){

                  if(c ==')'||c=='}'||c==']')
                        return true;

                  else 
                       return false;
        }

    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
       

        for(int i=0;i<s.length();i++){
 
             if(isOpen(s.charAt(i)))
                   st.push(s.charAt(i));
            

             
             if(s.charAt(i)==')')
             {

              if(!st.isEmpty()&& st.peek()=='(')
                        st.pop();
              else 
                  return false;
                 
             }
              if(s.charAt(i)=='}')
             {

              if(!st.isEmpty()&& st.peek()=='{')
                        st.pop();
              else 
                  return false;
                 
             }


             if(s.charAt(i)==']')
             {

              if(!st.isEmpty()&& st.peek()=='[')
                        st.pop();
              else 
                  return false;
                 
             }
      
                          
        }

        return st.isEmpty();
        
    }
}
