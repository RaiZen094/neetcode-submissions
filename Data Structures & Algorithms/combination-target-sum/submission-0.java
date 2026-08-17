class Solution {

    List<List<Integer>> list = new ArrayList<>();
    int[] nums;

    public List<List<Integer>> combinationSum(int[] nums, int target) {

        List<Integer> path = new ArrayList<>();

        this.nums=nums;

        backtrack(0,target,path);
        
        return list;

        
    }

    public void backtrack(int index, int target,List<Integer> path){
        
        if(index>=nums.length|| target<0)
                 return;

        if (target==0){

           list.add(new ArrayList<>(path));
           return;

        }

        path.add(nums[index]);
        backtrack(index,target-nums[index],path);
        path.remove(path.size()-1);
        backtrack(index+1,target,path);


    }
}
