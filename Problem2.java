public class PrimeNumber {
  public static boolean isPrime(int number) {
      if (number <= 1) {
          return false; // here the logic is if the number is less than or equal to 1, it is not a prime number.
      }
      for (int i = 2; i < number; i++) {
          if (number % i == 0) {
              return false; // the logic here is if the number is divisible by any number from 2 to 1 then it's not a prime number.
          }
      }
      return true; //  return true if the number is not divisible by any number from 2 to 1 then it is a prime number.
  }

  // here is just our main method.
  public static void main(String[] args) {
      int number = 17; 
      if (isPrime(number)) {
          System.out.println(number + " is a prime number."); // Print if the number is prime.
      } else {
          System.out.println(number + " is not a prime number."); // else print if the number is not prime.
      }
  }
}
