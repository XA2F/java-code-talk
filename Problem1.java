public class Factorial {
  // This method calculates the factorial of a given integer 'n'.
  public static int factorial(int n) {
      int result = 1; // Initialize 'result' to 1, as the factorial of 0 is 1.
      for (int i = 1; i <= n; i++) {
          result *= i; // Multiply 'result' by the current value of 'i' in each iteration.
      }
      return result; // Return the final result after the loop completes.
  }

  // Here we have our main method where our program execution starts.
  public static void main(String[] args) {
      int number = 5; // here we are defining our variable.
      int result = factorial(number); // here we will call the 'factorial' method to calculate the factorial of 'number'.
      System.out.println("Factorial of " + number + " is: " + result); // Here we are just printing our result.
  }
}
