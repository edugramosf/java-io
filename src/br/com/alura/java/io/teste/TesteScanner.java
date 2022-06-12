package br.com.alura.java.io.teste;

import java.io.File;
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

            String tipoConta = linhascanner.next();
            int agencia = linhascanner.nextInt();
            int numero = linhascanner.nextInt();
            String titular = linhascanner.next();
            double saldo = linhascanner.nextDouble();

            String valorFormatado = String.format("%s - %04d-%08d, %s: %05.2f", tipoConta, agencia, numero, titular, saldo);
            System.out.println(valorFormatado);

            linhascanner.close();


//            String[] valores = linha.split(",");
//            System.out.println(Arrays.asList(valores));
        }
        scanner.close();
    }
}
