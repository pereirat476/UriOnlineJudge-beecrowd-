import java.util.Locale;
import java.util.Scanner;

public class uri1002 {
    /*A fórmula para calcular a área de uma circunferência é:
    area = π . raio2. Considerando para este problema que π = 3.14159:
- Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.*/
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio,area,pi = 3.14159;
        raio = sc.nextDouble();
        area = pi * raio * raio;
        System.out.printf("A= %.4f%n",area);

        sc.close();
    }
}
