import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę do obliczenia silni: ");
        int n = scanner.nextInt();
        System.out.println("Silnia z " + n       + ": " + calculateSilnia(n));
        System.out.println("Silnia z " + (n + 1) + ": " + calculateSilnia(n + 1));
        System.out.println("Silnia z " + (n + 2) + ": " + calculateSilnia(n + 2));
    }

    private static int calculateSilnia(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        System.out.println("jakieś zmiany");
        return result;
    }

}
