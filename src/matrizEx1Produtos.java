import java.util.Scanner;

public class matrizEx1Produtos {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int quantidadeNumeros = 0;

        System.out.print("Informe a quantidade de números que serão digitados: \n");
        quantidadeNumeros = read.nextInt();

        int[] vetor = new int[quantidadeNumeros];

        for(int i = 0; i < quantidadeNumeros; i++) {
            System.out.printf("Digite o %d número: \n", (i+1));
            vetor[i] = read.nextInt();
        }

        System.out.print("Os valores são: \n");
        for(int i = 0; i < quantidadeNumeros; i++) {
            System.out.printf("Valor %d: %d\n", (i+1), vetor[i]);
        }

    }
}