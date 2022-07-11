import java.util.Scanner;

public class uri1004 {
    /*Leia dois valores inteiros.
    A seguir, calcule o produto entre estes dois valores e atribua esta operação à variável PROD.
     A seguir mostre a variável PROD com mensagem correspondente.Não esuqeça de mudar o nome da classe para main*/
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int A = sc.nextInt();
            int B = sc.nextInt();

            int prod = A * B;
            System.out.println("PROD = " + prod);

            sc.close();

    }
}
