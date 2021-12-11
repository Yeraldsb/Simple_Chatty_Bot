import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        --number1;
        int number2 = scanner.nextInt();
        --number2;
        int number3 = scanner.nextInt();
        --number3;
        int number4 = scanner.nextInt();
        --number4;
        System.out.print(number1 + " " + number2 + " " + number3 + " " + number4);
    }
}
