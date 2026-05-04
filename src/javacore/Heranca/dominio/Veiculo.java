package javacore.Heranca.dominio;

public class Veiculo {
    protected String marca;
    protected int ano;
    protected int velocidadeMaxima;
    protected String modelo;

    public Veiculo(String marca, int ano, int velocidadeMaxima, String modelo) {
        this.marca = marca;
        this.ano = ano;
        this.velocidadeMaxima = velocidadeMaxima;
        this.modelo = modelo;
    }

    public void exibirInfo(){
        System.out.println("Marca: "+this.marca);
        System.out.println("Ano: "+this.ano);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Velocidade Maxima: "+this.velocidadeMaxima+" KM/H");
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
