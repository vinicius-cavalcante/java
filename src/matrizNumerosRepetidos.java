public class matrizNumerosRepetidos {
    public static void main(String[] args) {
        int valores[] = new int[10];
        valores[0] = 1;
        valores[1] = 2;
        valores[2] = 3;
        valores[3] = 4;
        valores[4] = 5;
        valores[5] = 6;
        valores[6] = 7;
        valores[7] = 8;
        valores[8] = 9;
        valores[9] = 10;

        int resultado = 0;

        for(int i = 0; i < 5; i++) {
            resultado = resultado + valores[i] + valores[10-1-i];
        }

        System.out.printf("%d", resultado);
    }
}