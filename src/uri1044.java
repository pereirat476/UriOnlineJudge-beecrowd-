import java.util.Scanner;
/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
"Sao Multiplos" ou "Nao sao Multiplos",
indicando se os valores lidos são múltiplos entre si.*/
public class uri1044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a % b == 0 || b % a == 0){
            System.out.println("São multiplos");
        }
        else {
            System.out.println("Nao sao multiplos");
        }

    }
}
