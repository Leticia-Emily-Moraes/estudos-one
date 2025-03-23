package leticia.moraes.screenmatch;
import leticia.moraes.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) throws Exception {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        
        meuFilme.exibeFichaTécnica();
        meuFilme.avaliar(8);
        meuFilme.avaliar(5);
        meuFilme.avaliar(10);
        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.getAvaliacaoDoFilme());
    }
}
