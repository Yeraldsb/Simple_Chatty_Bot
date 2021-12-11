import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean graterThanC = a + b > c;
        boolean graterThanB = a + c > b;
        boolean graterThanA = b + c > a;

        System.out.println(graterThanA && graterThanB && graterThanC ? "YES" : "NO");


    }
}