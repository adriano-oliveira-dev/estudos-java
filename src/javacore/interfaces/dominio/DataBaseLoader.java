package javacore.interfaces.dominio;

public class DataBaseLoader implements DataLoader,DataRemove{

    @Override
    public void load() {
        System.out.println("Loading. . .");
    }

    @Override
    public void checarPermissão() {
        DataLoader.super.checarPermissão();
    }

    @Override
    public void remove() {
        System.out.println("Removendo. . .");
    }

    public static void retriveMaxDataSize(){
        System.out.println("Dentro da DataBaseLoader");
    }
}
