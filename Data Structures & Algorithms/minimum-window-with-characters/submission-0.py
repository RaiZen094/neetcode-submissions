from collections import Counter

class Solution:
    def minWindow(self, s: str, t: str) -> str:

        if len(t) > len(s):
            return ""

        t_freq = Counter(t)
        window = {}

        have = 0
        need = len(t_freq)

        l = 0
        res = ""
        res_len = float("inf")

        for r in range(len(s)):

            ch = s[r]
            window[ch] = window.get(ch, 0) + 1

            # character requirement satisfied
            if ch in t_freq and window[ch] == t_freq[ch]:
                have += 1


            # current window is valid
            while have == need:

                # update answer
                if r - l + 1 < res_len:
                    res = s[l:r+1]
                    res_len = r - l + 1


                # remove left character
                left_char = s[l]
                window[left_char] -= 1

                # requirement broken
                if left_char in t_freq and window[left_char] < t_freq[left_char]:
                    have -= 1

                l += 1


        return res