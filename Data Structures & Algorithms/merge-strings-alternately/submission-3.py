class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        c_Length = max(len(word1),len(word2))

        ans = []

        for k in range(c_Length):

            if k<len(word1):
                ans.append(word1[k])

            if k<len(word2):
                ans.append(word2[k])

            

        return "".join(ans)
                
