class Solution:
    def minWindow(self, s: str, t: str) -> str:

        if(len(s)<len(t)):
            return ""

        l = 0
        need = Counter(t)
        window = {}
  
        have = 0
        need_count = len(need)

        res = ""
        r_len = len(s) + 1

        for r in range(len(s)):

            window[s[r]] = window.get(s[r],0)+1

            if window[s[r]] == need[s[r]]:
                have+=1
            
            while have == need_count:

                if r-l+1 < r_len :
                    res = s[l:r+1]
                    r_len = r-l+1
               
                

                window[s[l]] = window.get(s[l]) - 1

                if window[s[l]] < need[s[l]]:
                    have-=1
                l+=1

        return res





