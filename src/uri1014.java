import java.util.Locale;
import java.util.Scanner;

public class uri1014 {
    /*Calcule o consumo médio de um automóvel sendo fornecidos
    a distância total percorrida (em Km) e o total de combustível gasto (em litros).*/
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        double z = x / y;

        System.out.printf("%.3f%n km/l",z);

        sc.close();
    }
}
