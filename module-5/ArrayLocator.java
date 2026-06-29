public class ArrayLocator {

    // Returns the {row, col} location of the largest element in a double[][]
    public static int[] locateLargest(double[][] arrayParam) {
        int maxRow = 0;
        int maxCol = 0;
        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                if (arrayParam[row][col] > arrayParam[maxRow][maxCol]) {
                    maxRow = row;
                    maxCol = col;
                }
            }
        }
        return new int[] {maxRow, maxCol};
    }

    // Returns the {row, col} location of the largest element in an int[][]
    public static int[] locateLargest(int[][] arrayParam) {
        int maxRow = 0;
        int maxCol = 0;
        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                if (arrayParam[row][col] > arrayParam[maxRow][maxCol]) {
                    maxRow = row;
                    maxCol = col;
                }
            }
        }
        return new int[] {maxRow, maxCol};
    }

    // Returns the {row, col} location of the smallest element in a double[][]
    public static int[] locateSmallest(double[][] arrayParam) {
        int minRow = 0;
        int minCol = 0;
        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                if (arrayParam[row][col] < arrayParam[minRow][minCol]) {
                    minRow = row;
                    minCol = col;
                }
            }
        }
        return new int[] {minRow, minCol};
    }

    // Returns the {row, col} location of the smallest element in an int[][]
    public static int[] locateSmallest(int[][] arrayParam) {
        int minRow = 0;
        int minCol = 0;
        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                if (arrayParam[row][col] < arrayParam[minRow][minCol]) {
                    minRow = row;
                    minCol = col;
                }
            }
        }
        return new int[] {minRow, minCol};
    }

    public static void main(String[] args) {
        int[][] grid = {
            {3, 7, 2},
            {9, 1, 5},
            {4, 8, 6}
        };

        int[] largestLoc = locateLargest(grid);
        int[] smallestLoc = locateSmallest(grid);

        System.out.println("Largest value: " + grid[largestLoc[0]][largestLoc[1]]
            + " at row " + largestLoc[0] + ", col " + largestLoc[1]);
        System.out.println("Smallest value: " + grid[smallestLoc[0]][smallestLoc[1]]
            + " at row " + smallestLoc[0] + ", col " + smallestLoc[1]);
    }
}
