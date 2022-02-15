/**
 * Java1. Homework #2
 * 
 * @author Margarita Antonova
 * @version 16.02.2022
 */
public class homeWork2 {
    public static void main(String[] args) {
        System.out.println(checkSum(11, 1));
        checkPositive(-120);
        printString("Ur", 3);
        System.out.println(checkNegative(-5));
    }

    static boolean checkSum(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    static void checkPositive(int a) {
        if (a >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

    static boolean checkNegative(int a) {
        return a < 0;
    }

    static void printString(String word, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(word);
        }
    }
}
