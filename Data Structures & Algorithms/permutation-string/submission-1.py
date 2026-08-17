class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:

        if len(s1) > len (s2):
            return False
        
        l=0

        for r in range(len(s2)):
            
            if r-l+1 == len(s1):
                if sorted(s1) == sorted(s2[l:l+len(s1)]):
                    return True
                else:
                    l+=1

        return False

        
        