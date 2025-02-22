public class test_code {
    public static void main(String[] args) {
        Graph g = new Graph(3, 3);
        g.printMatrix();
    }
}

class Graph {
    int[][] adjMatrix;
    int row, col;

    Graph(int r, int c) {
        this.row = r;
        this.col = c;
        adjMatrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                adjMatrix[i][j] = 0;
            }
        }
    }

    void printMatrix() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
