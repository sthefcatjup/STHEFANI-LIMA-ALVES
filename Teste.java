Teste.java



public class Teste {
    public static void main(String[] args){
        //Sthefani Lima 
        //usando o encapsulamento
        Passageiro m = new Passageiro();
        m.setNome("Sthef");
        m.setIdade(18);
        
        CalculadoradeTarifa c = new CalculadoradeTarifa();
        System.out.println("O valor da corrida foi: ");
        c.valorCorrida(20);

        Viagem v = new Viagem();
        v.setLocalizacão("São Paulo");

        v.realizarviagem(s);
        v.viagemFinalizada(s);

    }
}
