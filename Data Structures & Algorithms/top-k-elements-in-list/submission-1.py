class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        
        k_freq = Counter(nums)
        res = []
        for pair in k_freq.most_common(k):
            res.append(pair[0])
        return res