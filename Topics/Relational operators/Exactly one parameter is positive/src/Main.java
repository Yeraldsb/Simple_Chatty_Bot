import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int number = 0;

        boolean one = num1 > number && num2 <= number && num3 <= number;
        boolean two = num1 <= number && num2 > number && num3 <= number;
        boolean three = num1 <= number && num2 <= number && num3 > number;

        System.out.print(one|| two || three);
    }
}
