package intro;

public class Aula07ArraysMultidimensionais01 {
    public static void main(String[] args) {
        //Meses 1,2,3,4,5,6,7,8,9,10,11,12
        //Dias 31,28,31,30 Dias

        int [][] dias = new int[3][3];
        dias[0][0]=31;
        dias[0][1]=28;
        dias[0][2]=30;

        dias[1][0]=31;
        dias[1][1]=28;
        dias[1][2]=30;

        dias[2][0]=31;
        dias[2][1]=28;
        dias[2][2]=30;

        for (int i = 0; i < dias.length ; i++) {
            for (int j = 0; j < dias[i].length ; j++) {
                System.out.println(dias[i][j]);

            }

        }
        System.out.println("---------------------------------");

        for(int[] arrBase:dias){
            for(int num:arrBase){
                System.out.println(num);

            }

        }
    }
}
