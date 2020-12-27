from typing import *

class leetcode_733(object):
    """leetcode_733 documentation"""

    def __init__(self, *args):
        """Constructor for leetcode_733"""
        pass
        
    def solve(self):
        pass

    def floodFillRecur(self, image: List[List[int]], sr: int, sc: int, color: int, newColor: int) -> List[List[int]]:
        if sr < 0 or sr >= len(image) or sc < 0 or sc >= len(image[0]):
            return image

        if image[sr][sc] == color:
            image[sr][sc] = newColor
            self.floodFillRecur(image, sr-1, sc, color, newColor)
            self.floodFillRecur(image, sr+1, sc, color, newColor)
            self.floodFillRecur(image, sr, sc-1, color, newColor)
            self.floodFillRecur(image, sr, sc+1, color, newColor)
        return image

    def floodFill(self, image: List[List[int]], sr: int, sc: int, newColor: int) -> List[List[int]]:
        '''
        1 1 1
        1 1 0
        1 0 1
        :param image:
        :param sr:
        :param sc:
        :param newColor:
        :return:
        '''
        color = image[sr][sc]
        if color != newColor:
            return self.floodFillRecur(image, sr, sc, color, newColor)
        return image
        
if __name__ == '__main__':
    l:leetcode_733 = leetcode_733()
    l.solve()

