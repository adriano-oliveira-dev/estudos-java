package intro;

import java.util.Scanner;
public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // Imprima o dia da semana considerando 1 como domingo!
        // char, byte, short, enum, string

        byte dia= 0;
        Scanner scn = new Scanner(System.in);

        /*System.out.println("DIGITE O DIA DA SEMANA COM UM NUMERO, EX: 1 PARA DOMINGO.");
        dia = scn.nextByte();

        switch (dia){
            default:
                System.out.println("Opção Invalida!");
                break;
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
        } */



        char sexo = 0;
        System.out.println("Digite 'M' para Homem ou Digite 'F' para Mulher. ");

        sexo = scn.next().charAt(sexo);

        switch(sexo){
            default:
                System.out.println("Opção invalida!");
            break;
            case 'M':
                System.out.println("Homem");
            break;
            case 'm':
                System.out.println("Homem");
            break;
            case 'F':
                System.out.println("Mulher");
            break;
            case 'f':
                System.out.println("Mulher");
            break;


        }

    }
}
