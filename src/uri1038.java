import java.util.Locale;
import java.util.Scanner;

public class uri1038 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();
        double quantidade = sc.nextInt();
        double total ;

        if(codigo == 1){
           total =  quantidade * 4.00;
            System.out.printf("Total R$ = %.2f%n",total);
        } else if (codigo == 2) {
            total =  quantidade * 4.50;
            System.out.printf("Total R$ = %.2f%n",total);
        } else if (codigo == 3) {
            total = quantidade * 5.00;
            System.out.printf("Total R$ = %.2f%n",total);
        } else if (codigo == 4) {
            total = quantidade * 2.00;
            System.out.printf("Total R$ = %.2f%n",total);
        } else if (codigo == 5) {
            total = quantidade * 1.50;
            System.out.printf("Total R$ = %.2f%n",total);
        }
    }
}
