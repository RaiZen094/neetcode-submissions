class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        count = 0
        def dfs(i:int,j:int):
            if i<0 or i >= len(grid) or j<0 or j>= len(grid[0]) or grid[i][j] == '0':
                return
            grid[i][j]='0'
            dfs(i-1,j)
            dfs(i,j-1)
            dfs(i+1,j)
            dfs(i,j+1)


            grid[i][j] = '0'

        for m in range(len(grid)):
            for n in range(len(grid[0])):
                if grid[m][n]=='1':
                    count+=1
                    dfs(m,n)
            
        return count
