class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        r=l=0
        longest=0

        seen = set()


        while(r<len(s)):

            if s[r] in seen:

                while s[r] in seen:
                    seen.discard(s[l])
                    l+=1

            longest= max(longest,r-l+1)
            

            seen.add(s[r])
            r+=1

        
        return longest



