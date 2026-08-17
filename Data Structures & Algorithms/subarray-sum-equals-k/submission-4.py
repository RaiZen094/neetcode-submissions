class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:

        prefix = 0
        freq = {}
        freq[0]=1
        count = 0 


        for i in nums:
            prefix+=i

            
            count+= freq.get(prefix-k,0)

            freq[prefix] = freq.get(prefix,0)+1

        return count 
        