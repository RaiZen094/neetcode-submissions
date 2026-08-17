class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int max= Arrays.stream(piles).max().getAsInt();

        int l=1,r=max;

        int res=0;

        while(l<=r){
       
          int k=(l+r)/2;
         
          long time=0;

          for(int p:piles){

            time+=Math.ceil((double)p/k);
          }

          if(time>h){
             l=k+1;
          }
          else if(time<=h){

              res=k;
              r=k-1;
          }
        }


        return res;


        
    }
}
