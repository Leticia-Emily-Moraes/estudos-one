public class Condicional {
    public static void main(String[] args) {
        int ano = 2009;
        boolean includoNoPlano = true;
        double notaDoFilme = 9.9;

        String tipoPlano = "plus";

        if(ano > 2022){
            System.out.println("Lançamento que os clientes estão curtindo!");
        }else{
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if(includoNoPlano || tipoPlano.equals("plus")){
            System.out.println("Filme liberado");
        }else{
            System.out.println("Deve pagar a locação");
        }
    }
}
