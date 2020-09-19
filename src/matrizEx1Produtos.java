/*
Algoritmo que recebe um valor que foi depositado e armazena em um vetor (de 12 posições) o valor com rendimento
nos 12 meses seguintes. Considerar juros fixo mensal de 1%. Ao final, some todos os valores do vetor e apresente
o montante total e o valor do ganho total obtido.
 */

import java.util.Scanner;

public class matrizEx1Produtos {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[][] codigoQuantidade = new int[5][2];
        double[][] precoSubTotal = new double[5][2];
        double totalGeral = 0.0;

        for(int i = 0; i < 5; i++) {
            System.out.printf("Digite o código do produto [%d]\n", (i+1));
            codigoQuantidade[i][0] = ler.nextInt();

            System.out.printf("Digite a quantidade do produto [%d]\n", (i+1));
            codigoQuantidade[i][1] = ler.nextInt();

            System.out.printf("Digite o preço do produto [%d]\n", (i+1));
            precoSubTotal[i][0] = ler.nextDouble();

            precoSubTotal[i][1] = codigoQuantidade[i][1] * precoSubTotal[i][0];

            totalGeral += precoSubTotal[i][1];
        }

        System.out.print("CODIGO    QTD    PRECO    SUBTOTAL\n");
        System.out.print("----------------------------------\n");

        for(int i = 0; i < 5; i++) {
            System.out.printf("%d    %d    %f    %f\n", codigoQuantidade[i][0], codigoQuantidade[i][1],
                    precoSubTotal[i][0], precoSubTotal[i][1]);
        }

        System.out.print("-------\n");
        System.out.printf("\nTotal: %f\n", totalGeral);

    }
}
