package javacore.exceptions.excepition.test;

import javacore.exceptions.dominio.Leitor1;
import javacore.exceptions.dominio.Leitor2;

import java.io.*;

public class TryWithResourcesTest {
    public static void main(String[] args) {
        lerArquivo1();
    }
    public static void lerArquivo1(){
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()){

        } catch (IOException e) {

        }
    }

    // maneira errada  abaixo!
    public static void lerArquivo2(){
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try{
                if (reader != null ){
                    reader.close();

                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

}
