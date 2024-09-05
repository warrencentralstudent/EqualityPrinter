class Main {
    public static void main(String[] args) {
        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(-1, -1, -1);
        printEqual(1, 2, 3);
    }

    private static void printEqual(int num1, int num2, int num3) {
        if (num1 < 0 && num2 < 0 && num3 < 0) {
            System.out.println("Invalid Value");
        }
        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal");
        }
        if (num1 != num2 && num1 != num3 && num2 != num3) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}