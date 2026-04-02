package exerciciosDoWhile;

import java.util.Locale;
import java.util.Scanner;

public class farenheit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.of("pt", "BR"));

        int op = 0;
        double fh = 0;
        double C = 0;

        do {
            System.out.println("Selecione a conversão: Farenheit para Celcius(1)");
            System.out.println("Celcius para Farenheit(2)");
            System.out.println("Sair(3)");
            op = sc.nextInt();

            if (op == 1) {

                System.out.print("Digite a temperatura em Farenheit: ");
                fh = sc.nextInt();
                C = (fh - 32) / 1.8;

                System.out.printf("Temperatura em Celsius: %.2f%n", C);

            } else if (op == 2) {
                System.out.print("Digite a temperatura em Celcius: ");
                C = sc.nextDouble();
                fh = (C * 1.8) + 32;

                System.out.printf("Temperatura em Farenheit: %.2f%n", fh);

            } else if (op != 3)
                System.out.println("Opção inválida.");

        } while (op != 3);

        System.out.println("Muito obrigado !");
        sc.close();
    }
}
