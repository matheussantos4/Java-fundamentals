package exerciciosForCurso;

import java.util.Scanner;

public class ex1Impares {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        for (int i = 1; i <= X; i++) {

            if (i % 2 != 0) {
                System.out.println(i);
            }

            // Regra é que todo número par é divisível por 2 e o
            // resto sempre será 0, ou seja, se i % 2 != 0, é ímpar.

        }

        sc.close();

    }

}
