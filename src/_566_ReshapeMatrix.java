import java.util.Arrays;

public class _566_ReshapeMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        if (m * n != r * c) {
            return mat;
        }

        int newmat[][] = new int[r][c];
        int newr = 0, newc = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                newmat[newr][newc] = mat[i][j];
                newc++;

                if (newc == c) {
                    newc = 0;
                    newr++;
                }
            }
        }
        return newmat;
    }

    public static void main(String[] args) {
        int[][] mat = {{1, 2}, {3, 4}};
        int r = 1;
        int c = 4;
        _566_ReshapeMatrix sol = new _566_ReshapeMatrix();
        int[][] reshapedMat = sol.matrixReshape(mat, r, c);
        System.out.println("Original Matrix: " + Arrays.deepToString(mat));
        System.out.println("Reshaped Matrix (" + r + "x" + c + "): " + Arrays.deepToString(reshapedMat));
    }
}