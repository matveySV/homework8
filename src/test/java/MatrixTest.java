import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MatrixTest {
    @Test
    void transposeMatrix() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        int[][] transposedMatrix = {{1, 4}, {2, 5}, {3, 6}};
        Matrix matr = new Matrix();

        assertThat(matr.transposeMatrix(matrix)).hasDimensions(3,2);
        assertThat(matr.transposeMatrix(matrix)).isEqualTo(transposedMatrix);
    }

}
