class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        freq_map =defaultdict(list)

        for s in strs:
            
            freq_map["".join(sorted(s))].append(s)

        res = []


        for value in freq_map.values():
            res.append(value)
            
        return res