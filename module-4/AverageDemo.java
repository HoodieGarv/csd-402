/*
 *
 * Overloaded average() Methods
 *
 * Four overloaded methods, one per primitive numeric type,
 * each returns the average of the array passed in:
 *
 *   public static short  average(short[] array)
 *   public static int    average(int[] array)
 *   public static long   average(long[] array)
 *   public static double average(double[] array)
 *
 * The arrays used in main() are deliberately different sizes
 * to confirm each method works independently of the others.
 */
public class AverageDemo {

  public static void main(String[] args) {

    short  [] shortArray  = {10, 20, 30};
    int    [] intArray    = {15, 25, 35, 45};
    long   [] longArray   = {1000L, 2000L, 3000L, 4000L, 5000L};
    double [] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5, 6.5};

    System.out.println("===== short[]  (" + shortArray.length + " elements) =====");
    printArray(shortArray);
    System.out.println("Average = " + average(shortArray));
    System.out.println();

    System.out.println("===== int[]  (" + intArray.length + " elements) =====");
    printArray(intArray);
    System.out.println("Average = " + average(intArray));
    System.out.println();

    System.out.println("===== long[]  (" + longArray.length + " elements) =====");
    printArray(longArray);
    System.out.println("Average = " + average(longArray));
    System.out.println();

    System.out.println("===== double[]  (" + doubleArray.length + " elements) =====");
    printArray(doubleArray);
    System.out.println("Average = " + average(doubleArray));
    System.out.println();
  }

  /*
   * Overloaded average() methods
   */

  public static short average(short[] array) {

    int sum = 0;

    for (short value : array) {
      sum += value;
    }

    return (short) (sum / array.length);
  }

  public static int average(int[] array) {

    int sum = 0;

    for (int value : array) {
      sum += value;
    }

    return sum / array.length;
  }

  public static long average(long[] array) {

    long sum = 0;

    for (long value : array) {
      sum += value;
    }

    return sum / array.length;
  }

  public static double average(double[] array) {

    double sum = 0;

    for (double value : array) {
      sum += value;
    }

    return sum / array.length;
  }

  /*
   * Overloaded printArray() helper methods
   * Print the original array elements on one readable line
   */

  public static void printArray(short[] array) {

    System.out.print("Elements: ");

    for (int i = 0; i < array.length; i++) {

      System.out.print(array[i]);

      if (i < array.length - 1) {
        System.out.print(", ");
      }
    }

    System.out.println();
  }

  public static void printArray(int[] array) {

    System.out.print("Elements: ");

    for (int i = 0; i < array.length; i++) {

      System.out.print(array[i]);

      if (i < array.length - 1) {
        System.out.print(", ");
      }
    }

    System.out.println();
  }

  public static void printArray(long[] array) {

    System.out.print("Elements: ");

    for (int i = 0; i < array.length; i++) {

      System.out.print(array[i]);

      if (i < array.length - 1) {
        System.out.print(", ");
      }
    }

    System.out.println();
  }

  public static void printArray(double[] array) {

    System.out.print("Elements: ");

    for (int i = 0; i < array.length; i++) {

      System.out.print(array[i]);

      if (i < array.length - 1) {
        System.out.print(", ");
      }
    }

    System.out.println();
  }
}
