import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String cityName = sc.nextLine();
        boolean endsWith = cityName.endsWith("burg");
        System.out.println(endsWith);
    }
}