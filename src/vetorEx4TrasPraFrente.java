/*
Definir um vetor do tipo inteiro com n posições.
O usuário irá fornecer o conteúdo de cada elemento do vetor.
Imprimir o conteúdo fornecido pelo usuário de trás pra frente.
 */

// Importando scanner
import java.util.Scanner;

public class vetorEx4TrasPraFrente {
    public static void main(String[] args) {
        // Criando scanner
        Scanner ler = new Scanner(System.in);

        // Obter valor n
        System.out.printf("Digite o valor n: \n");
        int n = ler.nextInt();

        System.out.printf("Massa! Agora, vamos anotar os próximos valores, beleza?\n");

        // Pegar todos os números
        int[] numeros = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Digite o %dº número: \n", (i+1));
            numeros[i] = ler.nextInt();
        }

        System.out.printf("Valores em ordem crescente: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d  ", numeros[i]);
        }

        int maior = numeros[0];
        int menor = numeros[0];

        System.out.printf("\nValores em ordem decrescente: ");
        for (int i = n-1; i >= 0; i--) {
            System.out.printf("%d ", numeros[i]);

            if (numeros[i] > maior) {
                maior = numeros[i];
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.printf("\nBeleza! O maior número encontrado foi %d, enquanto o menor foi %d!", maior, menor);
    }
}
