package javacore.Heranca.dominio;

public class Carro extends Veiculo{
    private int quantiPortas;


    public Carro(String marca, int ano, int velocidadeMaxima, String modelo, int quantiPortas) {
        super(marca, ano, velocidadeMaxima, modelo);
        this.quantiPortas = quantiPortas;
    }

    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Portas: "+this.quantiPortas);


    }


    public int getQunatiPortas() {
        return quantiPortas;
    }

    public void setQunatiPortas(int qunatiPortas) {
        this.quantiPortas = qunatiPortas;
    }
}
