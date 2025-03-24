package leticia.moraes.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public void setNome(String pNome){
        this.nome = pNome;
    }

    public String getNome() {
        return this.nome;
    }

    public int getAnoDeLancamento() {
        return this.anoDeLancamento;
    }

    public void setAnoDeLancamento(int pAnoDeLancamento) {
        this.anoDeLancamento = pAnoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return this.incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean pIncluidoNoPlano) {
        this.incluidoNoPlano = pIncluidoNoPlano;
    }

    public double getSomaDasAvaliacoes() {
        return this.somaDasAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return this.duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int pDuracaoEmMinutos) {
        this.duracaoEmMinutos = pDuracaoEmMinutos;
    }

    public void exibeFichaTécnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    public void avaliar(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double getAvaliacaoDoFilme(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
