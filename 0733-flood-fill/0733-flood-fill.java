class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        dfsHelper(image, sr, sc, image[sr][sc], color);
        return image;
    }

    public void dfsHelper(int[][] img, int i, int j, int origColor, int newColor){

        if(i < 0 || i >= img.length || j < 0 || j >= img[0].length || img[i][j] == newColor || img[i][j] != origColor) return;

        img[i][j] = newColor;

        dfsHelper(img, i-1,j, origColor, newColor);
        dfsHelper(img, i+1, j, origColor, newColor);
        dfsHelper(img, i, j-1, origColor, newColor);
        dfsHelper(img, i, j+1, origColor, newColor);
    }
}