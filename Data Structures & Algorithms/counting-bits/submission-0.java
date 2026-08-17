class Solution {
    public int[] countBits(int n) { 
       
        int[] res= new int[n+1];

        for(int i=0;i<=n;i++){
            
             res[i]=countOnes(i);

        }

        return res;
        
    }

     public int countOnes(int n) {

        int count=0;
        for(int i=0;i<32;i++){

            int mask=1<<i;

            if((n & mask)!=0)
                 count++;
        }

        return count;
    }
}
