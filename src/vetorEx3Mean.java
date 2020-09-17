import java.util.Scanner;

public class vetorEx3Mean {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] number = new int[10];
        int i = 0;
        double sum = 0.0;
        double mean = 0.0;

        for (i = 0; i < 10; i++) {
            System.out.printf("Type the %sº number: ", (i+1));
            number[i] = entrada.nextInt();
        }

        System.out.printf("Ok, calculating...\n");

        for (i = 0; i < 10; i++) {
            sum += (double)number[i];
        }

        mean = sum/10.0;

        System.out.printf("The mean of all the numbers is: %f", mean);
    }
}
