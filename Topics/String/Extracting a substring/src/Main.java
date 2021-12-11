import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(name.substring(num1, num2 + 1));
    }
}