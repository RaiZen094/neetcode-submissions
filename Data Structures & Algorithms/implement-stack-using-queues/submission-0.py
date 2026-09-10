class MyStack:

    def __init__(self):
        self.st = deque()
        

    def push(self, x: int) -> None:
        self.st.append(x)
        
    def pop(self) -> int:
        i = 0

        while i < len(self.st)-1 :
            cur = self.st.popleft()
            self.st.append(cur)
            i+=1
        return self.st.popleft()
        

    def top(self) -> int:
        return self.st[-1]
        

    def empty(self) -> bool:
        return not self.st
        


# Your MyStack object will be instantiated and called as such:
# obj = MyStack()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.top()
# param_4 = obj.empty()