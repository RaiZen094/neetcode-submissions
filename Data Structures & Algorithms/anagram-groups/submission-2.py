class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        freq_map =defaultdict(list)

        for s in strs:
            
            freq_map["".join(sorted(s))].append(s)

        
        return list(freq_map.values())