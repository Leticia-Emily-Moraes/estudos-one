package leticia.moraes.screenmatch;
import leticia.moraes.screenmatch.calculos.CalculadoraDeTempo;
import leticia.moraes.screenmatch.modelos.Filme;
import leticia.moraes.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) throws Exception {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        
        meuFilme.exibeFichaTecnica();
        meuFilme.avaliar(8);
        meuFilme.avaliar(5);
        meuFilme.avaliar(10);
        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.getAvaliacaoDoFilme());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutoPorEpisodio(50);
        System.out.println("Minutos para maratonar Lost: " + lost.getDuracaoEmMinutos());

        CalculadoraDeTempo calc = new CalculadoraDeTempo();

        calc.inclui(meuFilme);
        System.out.println(calc.getTempoTotal());
    }
}
