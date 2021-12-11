import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println(-15 < num && num <= 12 || 14 < num && num < 17 || 19 <= num ? "True" : "False");

    }
}