import java.util.Locale;
import java.util.Scanner;

public class uri1010 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codPec1 = sc.nextInt();
        int numPec1 = sc.nextInt();
        double valPec1 = sc.nextDouble();
        int codPec2 = sc.nextInt();
        int numPec2 = sc.nextInt();
        double valPec2 = sc.nextDouble();

        double valorAPagar = numPec1 * valPec1 + numPec2 * valPec2;
        System.out.printf("VALOR A PAGAR : R$ = %.2f%n" , valorAPagar);

        sc.close();
    }
}
