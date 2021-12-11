import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        boolean bn = scanner.nextBoolean();

        boolean weekDay = num1 >= 10 && num1 <= 20;
        boolean weekend = num1 >= 15 && num1 <= 25;
        System.out.println(weekDay && !bn || weekend && bn);

    }
}