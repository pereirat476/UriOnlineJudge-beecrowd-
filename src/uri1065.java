import java.util.Scanner;

public class uri1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        int totalPares = 0;

        for(int i = 0;i < 5; i++){
            x = sc.nextInt();
            if(x%2==0){
                totalPares += 1;
            }
        }
        System.out.println(totalPares + " valores pares");
        sc.close();
    }
}
