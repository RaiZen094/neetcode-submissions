class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length()>s2.length())
             return false;

        HashMap<Character,Integer> seen = new HashMap<>();

        for(int i=0;i<s1.length();i++){
            char c=s1.charAt(i);
            seen.put(c,seen.getOrDefault(c,0)+1);

        }

        int need = seen.size();


        for(int i=0;i<s2.length();i++){

           int cur=0;
           HashMap<Character,Integer> seen2 = new HashMap<>();
           
           for(int j=i;j<s2.length();j++){
           
           seen2.put(s2.charAt(j),seen2.getOrDefault(s2.charAt(j),0)+1);

           if(seen.getOrDefault(s2.charAt(j),0)<seen2.get(s2.charAt(j)))
              
              break;

           if(seen.getOrDefault(s2.charAt(j),0)==seen2.get(s2.charAt(j)))
              cur++;

           if(cur==need)
              return true;



           }

        }

         return false;
        
    }
}
