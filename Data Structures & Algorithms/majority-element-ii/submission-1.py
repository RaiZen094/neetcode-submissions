class Solution:
    def majorityElement(self, nums: List[int]) -> List[int]:
        freq = {}
        res = []
        for i in nums :

            freq[i] = freq.get(i,0)+1

        for i in nums:

            if freq[i] > len(nums)//3 and i not in res:
                res.append(i)


        return res