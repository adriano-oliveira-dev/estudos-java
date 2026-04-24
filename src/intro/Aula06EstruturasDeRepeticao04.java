package intro;
import java.util.Scanner;
public class Aula06EstruturasDeRepeticao04 {
    // Dado o valor de um carro, duscubra quantas vezes ele pode ser parcelado!
    // condição valor Parcela >= 1000.
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int count=0;
        long parcela = 0;
        long valorParcela;
        long valorDoCarro;
        System.out.println("Digite o valor do carro :");
        valorDoCarro= scn.nextLong();


        while  (parcela != 1000){
         count++;
         parcela = valorDoCarro/count;
         valorParcela =  valorDoCarro/count;
         if(parcela<1000){
             break;

         }

            System.out.println("quantidade de parcelas é "+count);
            System.out.println("valor da parcela é " +valorParcela);

        }



    }
}
