import java.util.Scanner;

public class CadastroAvaliacaoDeAlimentos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a quantidade de alimentos
        System.out.print("Digite a quantidade de alimentos: ");
        int numAlimentos = scanner.nextInt();

        // Cria um vetor para armazenar as avaliações
        double[] avaliacoes = new double[numAlimentos];

        // Loop para coletar as avaliações
        for (int i = 0; i < numAlimentos; i++) {
            double nota;
            while (true) {
                System.out.printf("Digite a avaliação para o alimento %d (entre 0 e 10): ", i + 1);
                nota = scanner.nextDouble();

                if (nota >= 0 && nota <= 10) {
                    avaliacoes[i] = nota;
                    break;
                } else {
                    System.out.println("A nota deve estar entre 0 e 10. Tente novamente.");
                }
            }
        }

        // Calcula a média das avaliações
        double soma = 0;
        for (double nota : avaliacoes) {
            soma += nota;
        }
        double media = soma / numAlimentos;

        // Exibe a média
        System.out.printf("A média das avaliações é: %.2f%n", media);

        scanner.close();
    }
}
