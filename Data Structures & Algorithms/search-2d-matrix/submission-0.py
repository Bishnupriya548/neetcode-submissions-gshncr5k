class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        rows,cols=len(matrix),len(matrix[0]);
        l,c=0,cols-1
        while l<rows and c>=0:
            if matrix[l][c]==target:
                return True
            elif matrix[l][c]<target:
                l+=1
            else:
                c-=1

        return False