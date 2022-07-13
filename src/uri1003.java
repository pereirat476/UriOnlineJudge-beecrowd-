import java.util.Scanner;

public class uri1003 {
    /*Leia dois valores inteiros, no caso para variáveis A e B.
    A seguir, calcule a soma entre elas e
    atribua à variável SOMA. A seguir escrever o valor desta variável.Não esqueca de mudar o
    nome da classe para main */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int soma = A + B;
        System.out.println("SOMA = " + soma);

        sc.close();
    }
}
