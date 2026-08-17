class Solution:
    def majorityElement(self, nums: List[int]) -> List[int]:
        res = []

        freq = Counter(nums)

        for pair in freq.most_common():
            if pair[1] > len(nums)//3:
                res.append(pair[0])


        return res