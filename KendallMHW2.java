package kendallmhw2;

import java.util.Scanner;


public class KendallMHW2 {

    //using recursion to print uppercase letters -method 1
    public static int countUppercase(String str1) {
        if (str1.length() == 0) { //base case
            return 0;
        }
        int upper = 0;
        if (str1.charAt(0) >= 'A' && str1.charAt(0) <= 'Z') {
            upper++;
        }
        return countUppercase(str1.substring(1)) + upper;
    }

    //method 2
    public static int count(char[] chars) {
        return count(chars, 0);
    }

    //method 2 - helper
    public static int count(char[] chars, int high) {  //char array and count
        if (high == chars.length) {
            return 0; //base case
        }
        if (chars[high] >= 'A' && chars[high] <= 'Z') {
            return 1 + count(chars, high + 1);
        } else {
            return 0 + count(chars, high + 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("CSC 230");
        System.out.println();
        System.out.println("This program creates a recursive method called countUppercase() to return\n"
                + "the number of uppercase letters in a string\n"
                + "A second method uses a recursive method and a helper method.\n "
                + "The method is called count() and it returns the number of uppercase letters in an array of\n"
                + "characters.\n");

        System.out.println("This is the run from calling countUppercase()");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str1 = in.nextLine();
        System.out.println("The uppercase letters in " + str1 + " is " + countUppercase(str1));

        System.out.println();
        System.out.println("This is the run from calling count()");
        System.out.print("Enter a string: ");
        String str2 = in.nextLine();
        char[] high = str2.toCharArray();
        System.out.println("The number of uppercase letters is " + count(high));
    }
}
