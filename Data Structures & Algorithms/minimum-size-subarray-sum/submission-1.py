class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        left = 0
        length = 100001

        window_sum = 0


        for right, num in enumerate(nums):

            window_sum+=num


            while window_sum >= target:

                length=min(length, right-left+1)

                window_sum-=nums[left]
                left+=1


            
        

        return 0 if length == 100001 else length



                

