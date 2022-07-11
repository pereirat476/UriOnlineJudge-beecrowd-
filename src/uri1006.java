import java.util.Locale;
import java.util.Scanner;

public class uri1006 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double media = (A * 2 + B * 3 + C * 5)/10;

        System.out.printf("MEDIA = %.1f%n",media);

        sc.close();
    }
}
