package javacore.interfaces.dominio;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;
    void load();

    default void checarPermissão(){
        System.out.println("Checando. . .");
    }

    public static void retriveMaxDataSize(){
        System.out.println("Dentro da interface");
    }
}
