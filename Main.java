// Tom Nguyen
// 11.8.24
// Recursion and JUnit assignment

public class Main {
    public static void main(String []args)
    {
        System.out.println("My First Java Program.");
    }

    public static int count8(int number) {
        // Base case for recursion
        if (n ==0) {
            return 0;
        }

        // Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6) 
        int lastDigit = n % 10; 

        // divide (/) by 10 removes the rightmost digit (126 / 10 is 12). 
        // So first we remove the right most digit, then we take the new most rightmost digit (which is the second last digit)
        int secondLastDigit = (n / 10) % 10; 

        // We are counting the occurences of 8's
        if (lastDigit == 8) {
            // except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4
            if (secondLastDigit == 8) {
                // Counts it as double because it has an 8 to the immediate left
                // We return count8(n/10) because we want to move on to the next digit using recursion
                return 2 + count8(n / 10);                
            } else {
                // Found 1 occurence of 8
                return 1 + count8(n / 10); 
            }
        } else {
            // If the last digit isn't 8.
            return count8(n / 10);
        }
    }
}