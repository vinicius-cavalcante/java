/*
Grupo de 10 pessoas resolveu fazer uma corrida.
Ao final da competição, cada participante verificou a quantidade de combustível consumido.
Elaborar um algoritmo que determine o consumo médio de cada automóvel da prova.
Dados de entrada:
- Distância total percorrida
- Modelo de cada um dos automóveis
- Total de combustível gasto por cada um
 */

import java.util.Scanner;

public class vetorEx6Corrida {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int quantidadeAutomoveis = 0;
    System.out.print("\nQuantos pilotos participaram da corrida? ");
    quantidadeAutomoveis = ler.nextInt();

    /* Variáveis de entrada*/
    double distanciaTotal = 0.0;
    String[] modelo = new String[quantidadeAutomoveis];
    double[] combustivelTotal = new double[quantidadeAutomoveis];

    /* Variáveis de saída*/
    double[] consumoMedio = new double[quantidadeAutomoveis];

    /* Input */
    System.out.print("Digite a distância total da competição: ");
    distanciaTotal = ler.nextFloat();



    for(int i = 0; i < quantidadeAutomoveis; i++) {
        System.out.printf("\nOk! Digite o modelo do automóvel do %d piloto: ", (i+1));
        modelo[i] = ler.next();
        System.out.printf("\nBeleza! Qual foi o total de combustível gasto?\n");
        combustivelTotal[i] = ler.nextDouble();
        consumoMedio[i] = combustivelTotal[i]/distanciaTotal;
        System.out.printf("O %s do %d piloto teve um consumo médio de %f litros por quilômetro.\n", modelo[i], (i+1), consumoMedio[i]);
    }

    for(int i = 0; i < quantidadeAutomoveis; i++) {
        System.out.print(i);
    }

    }
}