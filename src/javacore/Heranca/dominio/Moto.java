package javacore.Heranca.dominio;

public class Moto extends Veiculo{
    private int cilindradas;

    public Moto(String marca, int ano, int velocidadeMaxima, String modelo, int cilindradas) {
        super(marca, ano, velocidadeMaxima, modelo);
        this.cilindradas = cilindradas;
    }

    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Cilindradas: "+this.cilindradas);

    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
}
