import java.util.Locale;
import java.util.Scanner;

public class uri1008 {
    /*Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas,
    o valor que recebe por hora e calcula o salário desse funcionário.
    A seguir, mostre o número e o salário do funcionário, com duas casas decimais.*/
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int NumeroFuncionario = sc.nextInt();
        int HorasTrabalhadas = sc.nextInt();
        double ValorPorHoraTrabalhada = sc.nextDouble();

        double SalarioFinal = HorasTrabalhadas * ValorPorHoraTrabalhada;

        System.out.println("NUMBER = " + NumeroFuncionario);
        System.out.println("SALARY = " + SalarioFinal);
        sc.close();
    }
}
