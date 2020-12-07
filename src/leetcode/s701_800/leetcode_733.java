package leetcode.s701_800;

public class leetcode_733 {


    public boolean isValid(int sr, int sc, int row, int col){
        return (sr>=0 && sr<row) && (sc>=0 && sc<col);
    }

    public int[][] floodFill(boolean[][] visited, int[][] image, int sr, int sc, int color, int newColor, int row, int col) {
        if(isValid(sr, sc, row, col) && !visited[sr][sc] && image[sr][sc] == color) {
            image[sr][sc] = newColor;
            visited[sr][sc] = true;

            floodFill(visited, image, sr, sc-1, color, newColor, row, col);
            floodFill(visited, image, sr, sc+1, color, newColor, row, col);
            floodFill(visited, image, sr-1, sc, color, newColor, row, col);
            floodFill(visited, image, sr+1, sc, color, newColor, row, col);
        }
        return image;
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int row = image.length;
        int col = image[0].length;
        int color = image[sr][sc];
        boolean[][] visited = new boolean[row][col];
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                visited[i][j] = false;
            }
        }
        return floodFill(visited, image, sr, sc, color, newColor, row, col);

    }

    public static void main(String[] args) {
        leetcode_733 t = new leetcode_733();
    }
}
