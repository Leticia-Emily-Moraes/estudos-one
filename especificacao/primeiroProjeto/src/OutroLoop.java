import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacaoDoFilme = 0 , nota = 0;
        int totalDeNotas = 0;


        while (nota != -1) {
            System.out.println("Digite a sua avaliação para o filme ou -1 para encerrar: ");
            if(nota != -1){
                nota = leitura.nextDouble();
                mediaAvaliacaoDoFilme += nota;
                totalDeNotas++;
            }
        }

        System.out.println("Média de avaliação: " + mediaAvaliacaoDoFilme/totalDeNotas);
    }
}
