class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {

        boolean[] dp = new boolean[s.length()+1];

        dp[0]=true;

        for(int i=0;i<s.length();i++){
 
            for(String w:wordDict){

              if(!dp[i])
                  continue;

              if(i+w.length()<=s.length() && 
               s.substring(i,i+w.length()).equals(w)){

                 dp[i+w.length()]=true;
                
              }

            }

        }
        return dp[s.length()];
    }
}
