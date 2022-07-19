import java.util.Locale;
import java.util.Scanner;





/*Faça um programa que leia 6 valores. Estes valores serão somente negativos ou positivos (desconsidere os valores nulos). A seguir, mostre a quantidade de valores positivos digitados.
Entrada
Seis valores, negativos e/ou positivos.
Saída
Imprima uma mensagem dizendo quantos valores positivos foram lidos.*/




public class uri1060 {

    public static void main(String[] args)  {
    	Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double X;
        int totalPositive = 0;

        for (int i = 0; i < 6; i++) {
            X = input.nextDouble();
            if (X > 0) {
                totalPositive += 1;
            }
        }
        System.out.print(totalPositive + " valores positivos\n");

    }

}
