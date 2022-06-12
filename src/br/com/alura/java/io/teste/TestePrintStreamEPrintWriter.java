package br.com.alura.java.io.teste;

import org.w3c.dom.ls.LSOutput;

import java.io.*;

public class TestePrintStreamEPrintWriter {

    public static void main(String[] args) throws IOException {

//        PrintStream ps = new PrintStream(new File("lorem5.txt"));

        PrintWriter ps = new PrintWriter("lorem5.txt");

        ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        ps.println();
        ps.println();
        ps.println();
        ps.println("eufihweif weufhwefuh oweifjweofj woiejf");

        ps.close();

    }

}
