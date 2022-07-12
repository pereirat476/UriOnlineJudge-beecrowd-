import java.util.Locale;
import java.util.Scanner;

public class uri1011 {
    /*Faça um programa que calcule e mostre o volume de uma esfera sendo fornecido o valor de seu raio (R).
    A fórmula para calcular o volume é: (4/3) * pi * R3. Considere (atribua) para pi o valor 3.14159.*/
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double raio = sc.nextDouble();
        double pi = 3.14159;
        double volume = (4.0/3) * pi * Math.pow(raio, 3.0);

        System.out.printf("VOLUME = %.3f%n", volume);

    }
}
