class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        
        int n=nums.size();
        vector<int> prefix(n);
        vector<int> suffix(n);
        vector<int> res(n);
        

        for(int i=0;i<nums.size();i++){

           if(i!=0)
              prefix[i]=nums[i-1]*prefix[i-1];
           else 
              prefix[i]=1;              
        
        }

        for(int i=nums.size()-1;i>-1;i--){

           if(i!=nums.size()-1)
              suffix[i]=nums[i+1]*suffix[i+1];
           else 
              suffix[i]=1;
        }

        for(int i=0;i<nums.size();i++){

         res[i]=suffix[i]*prefix[i];             
        
        }

          
           return res;



        }

    
};
