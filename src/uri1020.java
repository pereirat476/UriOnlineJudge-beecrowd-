import java.util.Scanner;

public class uri1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int ano = N / 365;
        int resto = N % 365;
        int meses = resto / 30;
        int dias = resto % 30;


        System.out.println(ano + " ano(os)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(as)");

    }
}
