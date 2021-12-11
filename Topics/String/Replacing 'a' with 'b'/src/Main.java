import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String letters = scanner.nextLine();
        String str = letters.replace("a", "b");
        System.out.println(str);

    }
}