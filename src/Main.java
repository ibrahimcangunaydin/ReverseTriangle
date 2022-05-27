import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int digitNumber;

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number of digits: ");
        digitNumber = inp.nextInt();

        for (int i = 1; i <= digitNumber; i++) {
            for (int k = 1; k <= i - 1; k++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= (2 * (digitNumber - i) + 1); l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
