
class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        unordered_set<int> seen;
        bool dup=false;
        for(int x: nums){
            if(seen.count(x)){
                dup=true;
            }
            seen.insert(x);
         }
         return dup;
          }
};
