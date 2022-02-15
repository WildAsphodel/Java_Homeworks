public class MyHW1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 15, b = 28;
        System.out.println(a + b >= 0 ? "The amount is positive" : "The amount is negative");
    }

    public static void printColor() {
        int value = 8;
        if (value <= 0) {
            System.out.println("Red");
        } else if (value <= 100) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }
    }

    public static void compareNumbers() {
        int a = 226, b = -8;
        System.out.println(a >= b ? "a >= b" : "a < b");
    }
}
