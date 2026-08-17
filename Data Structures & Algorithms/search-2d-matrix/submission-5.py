class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        rows = len(matrix)
        cols = len(matrix[0])

        up = left =0
        right = cols-1
        bottom = rows-1
        row = -1

        while(up<=bottom):
            mid = up + (bottom-up)//2
            
            if(matrix[mid][0]>target):
                bottom=mid-1
                row = up
            elif(matrix[mid][0]<target):
                if(target<=matrix[mid][right]):
                    row = mid
                    break
                up=mid+1
                row = bottom
            else:
                return True
            

        while(left<=right):
            mid = left + (right-left)//2

            if matrix[row][mid]>target:
                right = mid - 1
            elif matrix[row][mid]<target:
                left = mid +1
            else:
                return True

        return False



