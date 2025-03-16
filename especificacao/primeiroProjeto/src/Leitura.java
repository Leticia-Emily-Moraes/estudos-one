import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String filme = leitura.nextLine();

        System.out.println("Digite o ano de lançamento do filme: ");
        int anoDeLancamento = leitura.nextInt();

        System.out.println("Digite a sua avaliação para o filme: ");
        double avaliacaoDoFilme = leitura.nextDouble();

        System.out.println(filme + " " + anoDeLancamento + " " + avaliacaoDoFilme);
    }
}
