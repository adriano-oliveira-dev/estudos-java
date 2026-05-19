package javacore.interfaces.dominio;

public class FileLoader implements DataLoader,DataRemove{

    @Override
    public void load() {
        System.out.println("Loading. . .");
    }

    @Override
    public void remove() {
        System.out.println("Removendo. . .");
    }

    @Override
    public void checarPermissão() {
        DataLoader.super.checarPermissão();
    }
}
