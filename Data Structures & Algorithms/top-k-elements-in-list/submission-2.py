class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        k_freq = Counter(nums)
        heap=[]

        for number, count in k_freq.items():
            heapq.heappush(heap,(-count,number))

        result=[]

        for _ in range(k):
            count,number = heapq.heappop(heap)
            result.append(number)

        return result