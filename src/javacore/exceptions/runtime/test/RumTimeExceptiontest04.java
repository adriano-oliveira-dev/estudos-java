package javacore.exceptions.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.sql.SQLOutput;

public class RumTimeExceptiontest04 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e){
            System.out.println(" dentro de ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException ");
        } catch (IndexOutOfBoundsException e){
            System.out.println(" dentro de IndexOutOfBoundsException ");
        } catch (RuntimeException e){
            System.out.println("dentro de RuntimeException");
        }
        try {
            talvezLanceException();
        } catch (SQLException | FileNotFoundException e) {
            System.out.println("dentro de SQLException | FileNotFoundException ");
        }
    }
    private static void talvezLanceException()throws SQLException, FileNotFoundException {

    }
}
