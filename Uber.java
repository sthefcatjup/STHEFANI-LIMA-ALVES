Uber.java


public abstract class Uber {
    //Superclasse
    //classe abstract
    private String nome;
    private double avaliação;



    public double getAvaliação() {
        return avaliação;
    }



    public void setAvaliação(double avaliação) {
        this.avaliação = avaliação;
    }



    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }


     
    public abstract void buscar();

}
