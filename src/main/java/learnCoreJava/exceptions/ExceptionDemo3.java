package learnCoreJava.exceptions;

import java.io.IOException;

public class ExceptionDemo3 {

    public static void main(String[] args) throws IOException {

        try {
            runCode();
        } catch (IOException e) {
            System.out.println("Error: "+ e.getMessage());
        }


    }

    static void runCode() throws IOException {
        throw new IOException();
    }

}
