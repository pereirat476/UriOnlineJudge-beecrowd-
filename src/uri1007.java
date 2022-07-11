import java.util.Scanner;

public class uri1007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        int dif = (A * B - C * D);

        System.out.println("DIFERENCA = " + dif);

        sc.close();
    }
}
