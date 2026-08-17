class Solution {

    public String encode(List<String> strs) {
    

        String enc="";

        
        

           for(String s:strs){
                     String len=String.valueOf(s.length());
                     enc=enc.concat(len+'#'+s);
          
                           }
            return enc; 
       
    }

    public List<String> decode(String str) {

        List<String> s= new ArrayList<>();

        int i=0;

        while(i<str.length()){
            

            int j=i;

            while(str.charAt(j)!='#'){
                j++;
            }

            int len= Integer.valueOf(str.substring(i,j));

            i=j+1;
            j=i+len;
            s.add(str.substring(i,j));
            i=j;


        }

        return s;
    }
}
