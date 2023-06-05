import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MatrixMultiplier {

    private final int[][] matrixA;
    private final int[][] matrixB;
    private final int[][] result;
    private final int threadCount;

    public MatrixMultiplier(int[][] matrixA, int[][] matrixB, int threadCount) {
        this.matrixA = matrixA;
        this.matrixB = matrixB;
        this.threadCount = threadCount;
        this.result = new int[matrixA.length][matrixB[0].length];
    }

    public int[][] multiply() {
        int rows = matrixA.length;
        int cols = matrixB[0].length;

        // Create a fixed thread pool
        ExecutorService executor = Executors.newFixedThreadPool(threadCount);

        // Divide the matrix into rows/threadCount number of sections
        int sectionSize = rows / threadCount;

        // Submit tasks to calculate the multiplication for each section
        for (int i = 0; i < threadCount; i++) {
            int start = i * sectionSize;
            int end = (i == threadCount - 1) ? rows : start + sectionSize;
			 System
            executor.submit(new MultiplicationTask(start, end, cols));
        }

        // Wait for all tasks to complete
        executor.shutdown();
        while (!executor.isTerminated()) {
        }

        return result;
    }

    private class MultiplicationTask implements Runnable {
        private final int start;
        private final int end;
        private final int cols;

        public MultiplicationTask(int start, int end, int cols) {
            this.start = start;
            this.end = end;
            this.cols = cols;
        }

        @Override
        public void run() {
            for (int i = start; i < end; i++) {
                for (int j = 0; j < cols; j++) {
                    for (int k = 0; k < matrixB.length; k++) {
                        result[i][j] += matrixA[i][k] * matrixB[k][j];
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrixA = {{1, 2, 3}, {4, 5, 6}};
        int[][] matrixB = {{7, 8}, {9, 10}, {11, 12}};
        MatrixMultiplier multiplier = new MatrixMultiplier(matrixA, matrixB, 2);
        int[][] result = multiplier.multiply();
        
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}