import java.util.Scanner;

public class matrizEx21ContagemDeUmElemento {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int qtdLinhas = 0;
        int qtdColunas = 0;
        int numMinimo = 0;
        int contador10 = 0;

        System.out.printf("Digite a quantidade de colunas: ");
        qtdColunas = read.nextInt();

        System.out.printf("Show! Agora, digite a quantidade de linhas: ");
        qtdLinhas = read.nextInt();

        System.out.printf("Digite o valor mínimo: ");
        numMinimo = read.nextInt();

        int[][] matriz = new int[qtdColunas][qtdLinhas];

        for(int i = 0; i < qtdColunas; i++) {
            for(int j = 0; j < qtdLinhas; j++) {
                System.out.printf("Insira o número [%d][%d]: ", i, j);
                matriz[i][j] = read.nextInt();
                if(matriz[i][j] > numMinimo) {
                    contador10++;
                }
            }
        }

        int[] numMaior = new int[contador10];

        int contador = 0;
        for(int i = 0; i < qtdColunas; i++) {
            for(int j = 0; j < qtdLinhas; j++) {
                if(matriz[i][j] > numMinimo) {
                    numMaior[contador] = matriz[i][j];
                    contador++;
                }
            }
        }


        System.out.printf("\n----------\n");
        System.out.printf("Quantidade de números maiores do que %d: %d\n", numMinimo, contador10);
        System.out.printf("Números maaiores do que %d: ", numMinimo);
        for(int i = 0; i < contador10; i++) {
            System.out.printf("%d\t",numMaior[i]);
        }

        System.out.printf("\n ------------ \n");
        for(int i = 0; i < qtdColunas; i++) {
            for(int j = 0; j < qtdLinhas; j++) {
                System.out.printf("%d\t", matriz[i][j]);
            }
            System.out.printf("\n");
        }
    }
}