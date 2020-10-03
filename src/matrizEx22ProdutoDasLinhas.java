import java.util.Scanner;

public class matrizEx22ProdutoDasLinhas {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[][] matriz = new int[3][4];

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 4; j++) {
                System.out.printf("Digite o valor [%d][%d]: ", i,j);
                matriz[i][j] = read.nextInt();
            }
        }

        int[] linha = new int[3];
        int[] coluna = new int[4];
        int produto = 1;

        for(int i = 0; i < 3; i++) {
            produto = 1;
            for(int j = 0; j < 4; j++) {
                produto = produto * matriz[i][j];
            }
            linha[i] = produto;
        }

        for(int j = 0; j < 4; j++) {
            produto = 1;
            for(int i = 0; i < 3; i++){
                produto = produto * matriz[i][j];
            }
            coluna[j] = produto;
        }

        for(int i = 0; i < 3; i++) {
            System.out.printf("Produto linha: %d\n", linha[i]);
        }

        for(int j = 0; j < 3; j++) {
            System.out.printf("Produto coluna: %d\n", coluna[j]);
        }
    }
}
