/*
Receber 4 notas de cada um dos 5 alunos. Calcular a média de cada Aluno e armazenar o valor em um vetor.
No final, imprimir o número de alunos em cada um dos casos:
- Aprovados: média igual ou superior a 7
- Em recuperação: média maior ou igual a quatro e menor do que 7
- Reprovados: média menor do que 4
 */
import java.util.Scanner;

public class vetorEx5Notas {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.printf("Olá! Vamos fazer o cadastro dos alunos! \n");

        String[] alunoNome = new String[5];
        int[] alunoNota = new int[4];
        double[] mediaAluno = new double[5];
        double[] soma = new double[5];
        int aprovados = 0;
        int rec = 0;
        int reprovados = 0;

        for(int i = 0; i < 5; i++) {
            System.out.printf("Por favor, digite o nome do %dº aluno: ", (i+1));
            alunoNome[i] = ler.next();
            for(int x = 0; x < 4; x++) {
                System.out.printf("Digite a nota do %s no %dº bimestre: \n", alunoNome[i], (x+1));
                alunoNota[x] = ler.nextInt();
                soma[i] += (double)alunoNota[x];
            }
            mediaAluno[i] = soma[i]/4;
            if(mediaAluno[i] >= 7) {
                aprovados++;
            }
            else if(mediaAluno[i] < 7 && mediaAluno[i] >= 4) {
                rec++;
            }
            else {
                reprovados++;
            }
        }
        System.out.printf("%d alunos Aprovados \n%d alunos em Recuperação \n%d alunos Reprovados", aprovados, rec, reprovados);



    }
}
