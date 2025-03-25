package leticia.moraes.screenmatch.modelos;

public class Serie extends Titulo{
    private int temporadas;
    private boolean ativa;
    private int episodiosPorTemporada;
    private int minutoPorEpisodio;


    public int getTemporadas() {
        return this.temporadas;
    }

    public void setTemporadas(int pTemporadas) {
        this.temporadas = pTemporadas;
    }

    public boolean isAtiva() {
        return this.ativa;
    }

    public boolean getAtiva() {
        return this.ativa;
    }

    public void setAtiva(boolean pAtiva) {
        this.ativa = pAtiva;
    }

    public int getEpisodiosPorTemporada() {
        return this.episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int pEpisodiosPorTemporada) {
        this.episodiosPorTemporada = pEpisodiosPorTemporada;
    }

    public int getMinutoPorEpisodio() {
        return this.minutoPorEpisodio;
    }

    public void setMinutoPorEpisodio(int pMinutoPorEpisodio) {
        this.minutoPorEpisodio = pMinutoPorEpisodio;
    }

}
