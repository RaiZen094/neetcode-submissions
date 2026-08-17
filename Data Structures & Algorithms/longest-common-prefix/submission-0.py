class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        ans = strs[0]
        
        for i in range(1,len(strs)):

            j=0

            while(j<min(len(strs[i]),len(ans))):

                if(ans[j] != strs[i][j]):
                    break
                j+=1
            
            ans = ans[:j]

        return ans