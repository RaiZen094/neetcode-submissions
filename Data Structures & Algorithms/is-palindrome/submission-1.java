class Solution {
    public boolean isPalindrome(String s) {

        boolean res=true;
        s=s.toLowerCase().replaceAll("[^A-Za-z0-9]","");

        if(s.isEmpty()){
            return true;
        }
        for(int i=0;i<s.length()/2+1;i++){

            if(s.charAt(i)==s.charAt(s.length()-1-i)){

                 res=res&&true;
            }

            else{
                res=res&&false;
                
            }
        }

        return res;


        


    }
}
