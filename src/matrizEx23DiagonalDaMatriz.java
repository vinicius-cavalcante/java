import java.util.Scanner;

public class matrizEx23DiagonalDaMatriz {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.printf("Digite o valor n: ");
        int n = read.nextInt();
        int[][] matriz = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                matriz[i][j] = (int)(Math.random()*10);
            }
        }

        int principal = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i == j) {
                    principal += matriz[i][j];
                }
            }
        }

        int secundaria = 0;
        for(int x = 0; x < n; x++) {
            secundaria += matriz[n-1-x][x];
        }

        System.out.printf("---------------\n--------------\nPrincipal = %d \nSecundária = %d\n ", principal, secundaria);
        System.out.printf("---------------\n--------------\n");

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++) {
                System.out.printf("%d\t", matriz[i][j]);
            }
            System.out.printf("\n");
        }
    }
}
