# STHEFANI-LIMA-ALVES
Prova de Java

public class CalculadoradeTarifa {
    //classe usada para calcular a viagem
    private double valor;
     double precokm;

    double valorCorrida(double Distancia){
        while(Distancia > 0){
            //10 reais por km
            this.precokm = 10;
            this.valor = precokm + valor;
            Distancia = Distancia -1;
        }
        return this.valor;
    }
}
