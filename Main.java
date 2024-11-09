// Tom Nguyen
// 11.8.24
// Recursion and JUnit assignment

public class Main {
    public static void main(String []args)
    {
        System.out.println("Recusion tests and JUnit assignment.");
    }

    // Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit, 
    // except that an 8 with another 8 immediately to its left counts double
    public static int count8(int number) {
        // Base case for recursion
        if (number == 0) {
            return 0;
        }

        // Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6) 
        int lastDigit = number % 10; 

        // divide (/) by 10 removes the rightmost digit (126 / 10 is 12). 
        // So first we remove the right most digit, then we take the new most rightmost digit (which is the second last digit)
        int secondLastDigit = (number / 10) % 10; 

        // We are counting the occurences of 8's
        if (lastDigit == 8) {
            // except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4
            if (secondLastDigit == 8) {
                // Counts it as double because it has an 8 to the immediate left
                // We return count8(n/10) because we want to move on to the next digit using recursion
                return 2 + count8(number / 10);                
            } else {
                // Found 1 occurence of 8
                return 1 + count8(number / 10); 
            }
        } else {
            // If the last digit isn't 8, then continue to the next digit.
            return count8(number / 10);
        }
    }

    // Counts the occurences of "hi" in the string
    public static int countHi(String str) {
        // Base case, where the length is less than 2 (so it cannot be "hi")
        if (str.length() < 2) {
            return 0;            
        }

        // Returns a string that is a substring of this string. The substring begins at the specified beginIndex and extends to the character at index endIndex - 1. 
        // Thus the length of the substring is endIndex-beginIndex.
        // Examples:
        // "hamburger".substring(4, 8) returns "urge"
        //  "smiles".substring(1, 5) returns "mile"
        // So substring(0,2) searches for the first 2 letters. 
        if (str.substring(0,2).equals("hi")) {
            // If the first 2 letters are "hi", increase the "hi" occurence count by 1.
            // Return the string, but with the first 2 letters cut off, since substring works by having the # in the parenthesis be the (beginIndex), ex: (beginIndex:2)
            return 1 + countHi(str.substring(2));
        } else {
            // No "hi" was found, so we only have to shorten it by one letter instead of two, because if the first letter was off, it doesnt mean the next 2 letters after won't equal "hi".
            return countHi(str.substring(1));
        }
    }

    public static int countHi2(String str) {
        // Base case, where the length is less than 2 (so it cannot be "hi")
        if (str.length() < 2) {
            return 0;            
        }


        // Returns a string that is a substring of this string. The substring begins at the specified beginIndex and extends to the character at index endIndex - 1. 
        // So substring(0,2) searches for the first 2 letters. 
        if (str.substring(0,2).equals("hi")) {

            // Return the string, but with the first 2 letters cut off, since substring works by having the # in the parenthesis be the (beginIndex), ex: (beginIndex:2)
            return 1 + countHi2(str.substring(2));

         // If the first 3 letters are "hi" with an 'x' immediately before them, ex: ("xhi"), then do not count and skip. 
         // Receives a bug if this 0,3 if statement is placed before the 0,2 if statement above (sometimes ran into an out of bounds error when trying to fix this)
         // The bug is that for "ahibhi", it only counts 1 instead of 2 if i try to do str.length() < 3 as the base case to fix the out of bounds error (because it cuts off the 3 letters bhi even though theres a hi)
         // If this is if statement is placed as the first in order, it will try to search substring(0,3) which is out of bounds. 
        } else if (str.substring(0,3).equals("xhi")) {
            // If the first 2 letters are "hi", increase the "hi" occurence count by 1.
            // Return the string, but with the first 2 letters cut off, since substring works by having the # in the parenthesis be the (beginIndex), ex: (beginIndex:2)
            return countHi2(str.substring(3));
        } else {
            // No "hi" was found, so we only have to shorten it by one letter instead of two, because if the first letter was off, it doesnt mean the next 2 letters after won't equal "hi".
            return countHi2(str.substring(1));
        }
    }

    public static int strCount(String str, String sub) {
        // Base case, where if the strength length is less than the sub length, return 0. 
        if (str.length() < sub.length()) {
            return 0;            
        }

        if (str.substring(sub.length()).equals(sub)) {
            // If the first letters are the "sub", increase the "sub" occurence count by 1.
            // Return the string, but with the first few letters cut off (per sub length), since substring works by having the # in the parenthesis be the (beginIndex), ex: (beginIndex:2)
            return 1 + strCount(str.substring(sub.length()), sub);
        } else {
            // No "sub" was found, so we only have to shorten it by one letter instead of two, because if the first letter was off, it doesnt mean the next 2 letters after won't equal "sub".
            return strCount(str.substring(1), sub);
        }
    }


}