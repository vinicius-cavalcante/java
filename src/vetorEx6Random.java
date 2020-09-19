import java.util.Scanner;

public class vetorEx6Random {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int n = 0;
        System.out.printf("Quantos números quer exibir?\n");
        n = ler.nextInt();

        int[] x = new int[n];

        int max = 1000;
        int min = 100;

        for(int i = 0; i < n; i++) {
            x[i] = (int)Math.round(Math.random()*max + min);
            System.out.printf(String.valueOf(x[i]));
            System.out.printf("\n");
        }

}
}
