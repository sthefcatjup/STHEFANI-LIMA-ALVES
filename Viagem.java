Viagem.java

public class Viagem {
    
    private double distancia;
    private String localizacão;
    private double tempoCorrida;

    public double getDistancia() {
        return distancia;
    }
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    public String getLocalizacão() {
        return localizacão;
    }
    public void setLocalizacão(String localizacão) {
        this.localizacão = localizacão;
    }
    public double getTempoCorrida() {
        return tempoCorrida;
    }
    public void setTempoCorrida(double tempoCorrida) {
        this.tempoCorrida = tempoCorrida;
    }

    //usando o polimorfismo
    void realizarviagem(Uber u){
        System.out.println("Viagem iniciada em: "+u.getNome());
    }
    void viagemFinalizada(Uber u){
        System.out.println("Viagem finalizada em: "+u.getNome());
    }

}


