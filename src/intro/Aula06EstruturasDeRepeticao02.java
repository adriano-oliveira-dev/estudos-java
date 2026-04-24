package intro;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // imprima todos os numero pares de 1 a 10000


        int count=0;

        while(count <=100000){
            count++;
            if (count % 2 == 0 ){
                System.out.println("numero par: " + count);

            }

        }
    }
}
