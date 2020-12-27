from typing import *

class leetcode_463(object):
    """leetcode_463 documentation"""

    def __init__(self, *args):
        """Constructor for leetcode_463"""
        pass
        
    def solve(self):
        self.islandPerimeter([[0,1,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]])

    def islandPerimeter(self, grid: List[List[int]]) -> int:
        count = 0
        for i in range(len(grid)):
            for j in range(len(grid[0])):
                if grid[i][j] == 1:
                    count += 4
                    # down
                    if i+1 < len(grid) and grid[i+1][j] == 1:
                        count -= 1

                    # up
                    if i-1 >= 0 and grid[i-1][j] == 1:
                        count -= 1

                    # left

                    if j-1 >= 0 and grid[i][j-1] == 1:
                        count -= 1


                    # right
                    if j+1<len(grid[0]) and grid[i][j+1] == 1:
                        count -= 1
        return count
if __name__ == '__main__':
    l:leetcode_463 = leetcode_463()
    l.solve()

