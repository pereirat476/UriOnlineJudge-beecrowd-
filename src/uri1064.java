import java.util.Locale;
import java.util.Scanner;

public class uri1064 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x ;
        int totalPositivo =0;
        double media = 0;


        for(int i=0;i<6;i++){
            x = sc.nextDouble();
            if(x>0) {
                totalPositivo += 1;
                media += x;
            }
        }

        media = media / totalPositivo;
        System.out.println(totalPositivo + " valores positivos\n");
        System.out.printf("%.1f%n",media);
        sc.close();
    }
}
