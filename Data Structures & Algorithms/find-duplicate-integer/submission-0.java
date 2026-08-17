class Solution {
    public int findDuplicate(int[] nums) {
   
           HashSet<Integer> set= new HashSet<>();
           int res=-1;


           for(int i=0;i<nums.length;i++){

               if(set.contains(nums[i])){
                res=nums[i];
               }
               set.add(nums[i]);

           }

           return res;

        
    }
}
