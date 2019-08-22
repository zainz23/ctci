/* 1-7 */
public void rotate(int[][] matrix) {
    int N = matrix.length;
    int layers = N / 2;

    for (int layer = 0; layer < layers; layer++) {
        // Last variable keeps track of end row/col
        int last = N - 1 - layer;   // layer denotes which layer we are in

        for (int i = layer; i < last; i++) {
            int temp = matrix[layer][i];   

            matrix[layer][i] = matrix[N-1-i][layer];
            matrix[N-1-i][layer] = matrix[N-1-layer][N-1-i];
            matrix[N-1-layer][N-1-i] = matrix[i][N-1-layer];
            matrix[i][N-1-layer] = temp;
        }
    }
}
