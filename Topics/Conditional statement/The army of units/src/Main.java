import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int army = sc.nextInt();

        if (army < 1) {
            System.out.println("no army");
        } else if (army <= 19) {
            System.out.println("pack");
        } else if (army >= 20 && army <= 249) {
            System.out.println("throng");
        } else if (army >= 250 && army <= 999) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
    }
}