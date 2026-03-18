
import java.util.Scanner;

public class EstudoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        int soma = 0;

        System.out.println("Digite números para somar. Digite 0 para encerrar:");
        x = sc.nextInt(); // primeira leitura antes do loop

        while (x != 0) { // encerra quando usuário digitar 0
            soma += x; // acumula o valor
            x = sc.nextInt(); // lê próximo número
        }

        System.out.println("Soma total: " + soma);
        sc.close();
    }
}
