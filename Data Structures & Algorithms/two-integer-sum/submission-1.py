class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        sum ={}

        for i in range(len(nums)):
            diff = target - nums[i]
            if diff in sum.keys():
                return [sum.get(diff),i]
            sum[nums[i]] = i

        