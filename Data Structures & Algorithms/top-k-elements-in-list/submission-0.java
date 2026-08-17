class Solution {
    public int[] topKFrequent(int[] nums, int k) {

       Map<Integer,Integer> freq = new HashMap<>();
       List<int[]> f= new ArrayList<>();
       
       for(int i : nums){
          freq.put(i,freq.getOrDefault(i,0)+1);
        }
       for(Map.Entry<Integer,Integer> e:freq.entrySet()){
        
        f.add(new int[]{e.getValue(),e.getKey()});

       }

       f.sort((a,b)->b[0]-a[0]);

       int[] solve=new int[k];


       for(int i=0;i<k;i++){

         solve[i]=f.get(i)[1];

       }

      return solve;
       

    

       }
       
    
}
