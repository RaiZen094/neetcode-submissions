class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        c_Length = max(len(word1),len(word2))

        ans = ""

        for k in range(c_Length):
            
            if k >= len(word1):
                ans = ans + word2[k:]
                break
            
            if k>= len(word2):
                ans = ans + word1[k:]
                break
            
            ans=ans+word1[k]
            ans=ans+word2[k]

        return ans
                
