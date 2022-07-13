import java.util.Scanner;

public class uri1013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x,y;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

         x = (a + b + Math.abs(a - b)) / 2;
         y = (x + c + Math.abs(x - c)) / 2;
         System.out.println(y + " eh o maior");
        sc.close();
    }
}
