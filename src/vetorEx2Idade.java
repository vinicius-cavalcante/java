import java.util.Scanner;

public class vetorEx2Idade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] nome = new String[3];
        int[] idade = new int[3];

        int i = 0;
        while (i < 3) {
            System.out.printf("Digite o nome: \n");
            nome[i] = entrada.next();

            System.out.printf("Digite a idade: \n");
            idade[i] = entrada.nextInt();

            i++;
        }

        for (i = 0; i < 3; i++) {
            if (idade[i] > 18) {
                System.out.printf("Nome: %s  \n", nome[i]);
                System.out.printf("Idade: %d \n", idade[i]);
            }

        }
    }
}
