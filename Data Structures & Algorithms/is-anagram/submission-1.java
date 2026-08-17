class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()==t.length()){
                    TreeMap<Character,Integer> hm1=new TreeMap<Character,Integer>();
                    TreeMap<Character,Integer> hm2=new TreeMap<Character,Integer>();
              for(int i=0;i<s.length();i++){

                          char c= s.charAt(i);
                          char d= t.charAt(i);

                   hm1.put(c,hm1.getOrDefault(c,0)+1);
                   hm2.put(d,hm2.getOrDefault(d,0)+1);
                              }

               if(hm1.equals(hm2)){
                         return true;
                    }   
                else 
                   return false;           
        }
        else
            return false;

    }
}
