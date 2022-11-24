PassageiroMesmo.java 


public class Passageiro extends Uber{
    //subclasse da Classe Uber
    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public void buscar(){
        System.out.println("Buscando corrida");
    }


}
