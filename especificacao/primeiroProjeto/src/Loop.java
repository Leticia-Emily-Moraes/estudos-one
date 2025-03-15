import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacaoDoFilme = 0 , nota = 0;


        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a sua avaliação para o filme: ");
            nota = leitura.nextDouble();
            mediaAvaliacaoDoFilme += nota;
        }

        System.out.println("Média de avaliação: " + mediaAvaliacaoDoFilme/3);
    }
}
