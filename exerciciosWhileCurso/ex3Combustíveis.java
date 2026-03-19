package exerciciosWhileCurso;

import java.util.Scanner;

public class ex3Combustíveis {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual sua preferencia de combustível?");
        System.out.println("1.Alcool 2.Gasolina 3.Diesel 4.FIM");

        int Alcool = 0;
        int Gasolina = 0;
        int Diesel = 0;

        int tipo = sc.nextInt();

        while (tipo != 4) {

            if (tipo == 1) {
                Alcool += 1;
            } else if (tipo == 2) {
                Gasolina += 1;
            } else if (tipo == 3) {
                Diesel += 1;
            } else
                System.out.println("Este não é um tipo de combustível.");
            tipo = sc.nextInt();
        }

        sc.close();

        System.out.println("Alcool: " + Alcool);
        System.out.println("Gasolina: " + Gasolina);
        System.out.println("Diesel: " + Diesel);
    }
}
