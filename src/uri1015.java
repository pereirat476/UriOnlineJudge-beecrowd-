import java.util.Locale;
import java.util.Scanner;

/*Leia os quatro valores correspondentes aos eixos x e y
de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e
 calcule a distância entre eles, mostrando 4 casas decimais após a vírgula, segundo a fórmula:

Distancia = */

public class uri1015 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();

        double distancia = Math.sqrt(Math.pow(a-c,2.0) + Math.pow(b-d,2.0));

        System.out.printf("%.4f%n",distancia);

        sc.close();
    }
}
