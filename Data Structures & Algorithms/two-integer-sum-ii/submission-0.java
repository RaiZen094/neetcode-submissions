class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int l=0,r=numbers.length-1;


       while(r>l){

        if(numbers[l]+numbers[r]<target)
               l++;

        if(numbers[l]+numbers[r]>target)
               r--;

        if(numbers[l]+numbers[r]==target)
              break;
        
       }

       l++;
       r++;

       return new int[]{l,r};
        
    }
}
