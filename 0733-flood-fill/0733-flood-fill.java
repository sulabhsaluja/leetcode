class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        floodFill(image, sr, sc, image[sr][sc], color);
        return image;
    }
    public void floodFill(int[][] img, int x, int y, int oldColor, int newColor){
        if(x < 0 || x >= img.length || y < 0 || y >= img[0].length || img[x][y] != oldColor || img[x][y] == newColor) return;

        img[x][y] = newColor;
        
        floodFill(img, x + 1, y, oldColor, newColor);
        floodFill(img, x - 1, y, oldColor, newColor);
        floodFill(img, x, y + 1, oldColor, newColor);
        floodFill(img, x, y - 1, oldColor, newColor);
    }
}