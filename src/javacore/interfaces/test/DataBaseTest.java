package javacore.interfaces.test;

import javacore.interfaces.dominio.DataBaseLoader;
import javacore.interfaces.dominio.FileLoader;

public class DataBaseTest {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataBaseLoader.load();
        fileLoader.load();

        dataBaseLoader.remove();
        fileLoader.remove();

        dataBaseLoader.checarPermissão();
        fileLoader.checarPermissão();
    }
}
