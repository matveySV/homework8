public class Matrix {
    public static int[][] transposeMatrix(int[][] matrix) {
        int column = matrix[0].length;
        int row = matrix.length;
        int[][] result = new int[column][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }
}
