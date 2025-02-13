import java.util.Scanner;
public class BarrasDeOuro {

public static void main(String[] args) {
    int N = 1;
    int soma = 0;
    while(N !=0){
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
        if( N <= 500 && N >=1){
            soma = N + soma;
        }
    }
    System.out.println(soma);
    
    
}

}

