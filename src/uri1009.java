import com.sun.tools.javac.Main;

import java.util.Locale;
import java.util.Scanner;

/*Faça um programa que leia o nome de um vendedor,
 o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro).
 Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas,
informar o total a receber no final do mês, com duas casas decimais.*/

public class uri1009 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String nome = sc.next();
        double salario = sc.nextDouble();
        double vendas = sc.nextDouble();
        double SalarioComBonus = (vendas * 0.15) + salario;

        System.out.printf("TOTAL = %.2f%n " + SalarioComBonus);
    }
}
