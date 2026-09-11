class MyQueue:

    def __init__(self):
        self.top = 0
        self.q = []

    def push(self, x: int) -> None:
        if not self.q:
            self.top = x

        self.q.append(x)

    def pop(self) -> int:
        aux = []

        while len(self.q) > 1:
            aux.append(self.q.pop())

        res = self.q.pop()

        while aux:
            self.q.append(aux.pop())

        if self.q:
            self.top = self.q[0]

        return res

    def peek(self) -> int:
        return self.top

    def empty(self) -> bool:
        return not self.q


# Your MyQueue object will be instantiated and called as such:
# obj = MyQueue()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.peek()
# param_4 = obj.empty()