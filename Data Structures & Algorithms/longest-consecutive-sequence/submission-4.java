class Solution {
    public int longestConsecutive(int[] nums) {
        int res=0;
        int min=1;
        Arrays.sort(nums);
        List<Integer> numr=new ArrayList<>();
        HashSet<Integer> h = new HashSet<>();
          for (int x : nums) h.add(x);


        for(int x: h){
            numr.add(x);

        }
        Collections.sort(numr);

        if(numr.size()==0){
    
              return res;

        }
        else if(numr.size()==1){

            return 1;
        }

        for(int i=0; i<numr.size()-1;i++)
        {
            
           if(numr.get(i)+1==numr.get(i+1))
           {
              min=min+1;

            if(min>res){

               res=min;
            }

           }
          else
                min=1;

        }

        return res;
        
    }
}
