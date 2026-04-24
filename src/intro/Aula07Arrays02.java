package intro;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        String [] nomes = new String [4];
        nomes [0] = "Adriano";
        nomes [1] = "Adriana";
        nomes [2] = "Nazilda";
        nomes [3] = "fabiana";
// .length retorna o numero de espaços dentro de uma array
        for (int i=0; i <nomes.length; i++){
            System.out.println(nomes[i]);
        }

    }
}
