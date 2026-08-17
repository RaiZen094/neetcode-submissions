class Solution:
    def isValid(self, s: str) -> bool:

        stack = []
        
        pairs = {
             ')':'(',
             '}':'{',
             ']':'['
        }
        if len(s)==1:
            return False

        for ch in s:
            if ch  in "({[":
                stack.append(ch)
  
            else:
                if len(stack)==0 or stack.pop() != pairs[ch]: 
                    return False

            

        return len(stack)==0