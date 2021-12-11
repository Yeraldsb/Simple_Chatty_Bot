import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int number = 20;
        boolean result = (a + b == number) || (a + c == number) || (b + c == number) ;
        System.out.println(result);

    }
}