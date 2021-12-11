import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine().replace(" ", "").trim();
        String line2 = sc.nextLine().replace(" ", "").trim();
        System.out.println(line1.equals(line2));
    }
}