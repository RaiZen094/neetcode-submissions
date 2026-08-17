class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int count=0;
        unordered_set<char> hs;
      
        int l=0;

        for(int r=0;r<s.size();r++){

            while(hs.find(s[r])!=hs.end()){

                hs.erase(s[l]);
                l++;

            }

        hs.insert(s[r]);

        count=max(count,r-l+1);

            
             
        }


        
        
        return count;
    }
};
