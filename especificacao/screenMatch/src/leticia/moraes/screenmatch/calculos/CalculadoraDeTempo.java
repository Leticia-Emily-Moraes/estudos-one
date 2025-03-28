package leticia.moraes.screenmatch.calculos;

import leticia.moraes.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal(){
        return this.tempoTotal;
    }

    public void inclui(Titulo pTitulo){
        tempoTotal += pTitulo.getDuracaoEmMinutos();
    }
}
