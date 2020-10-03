public class matrizSort {
    public static void main(String[] args) {
        //Variáveis
        int n = 10;
        int[] vetor = new int[n];

        //Adicionando valores aleatórios ao vetor
        for(int i = 0; i < n; i++) {
            vetor[i] = (int)(Math.random()*10);
        }


        //Imprimindo vetor original
        for(int i = 0; i < n; i++) {
            System.out.printf("%d\t", vetor[i]);
        }

        for(int x = 0; x < n; x++) {
            for (int i = 0; i < n - 1; i++) {
                if (vetor[i] % 2 == 0) {
                    int aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                }
            }
        }

        System.out.printf("\n");
        //Imprimindo vetor original
        for(int i = 0; i < n; i++) {
            System.out.printf("%d\t", vetor[i]);
        }

    }
}
