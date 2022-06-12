package br.com.alura.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteScanner {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(new File("contas.csv"));
        while(scanner.hasNextLine()) {
            String linha = scanner.nextLine();
//            System.out.println(linha);

            Scanner linhascanner = new Scanner(linha);
            linhascanner.useLocale(Locale.US);
            linhascanner.useDelimiter(",");

            String valor1 = linhascanner.next();
            int valor2 = linhascanner.nextInt();
            int valor3 = linhascanner.nextInt();
            String valor4 = linhascanner.next();
            double valor5 = linhascanner.nextDouble();

            String valorFormatado = String.format("%s - %s-%s, %s: %s", valor1, valor2, valor3, valor4, valor5);
            System.out.println(valorFormatado);

            linhascanner.close();


//            String[] valores = linha.split(",");
//            System.out.println(Arrays.asList(valores));
        }
        scanner.close();
    }
}
