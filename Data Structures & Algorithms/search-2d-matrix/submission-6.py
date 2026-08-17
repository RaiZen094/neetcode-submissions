class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
       
        up = left =0
        right = len(matrix[0])-1
        bottom = len(matrix)-1
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



