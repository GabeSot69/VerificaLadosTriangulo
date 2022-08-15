/*
    Nome: Gabriel Sotero Mendonça
    Objetivo: Sabendo que triângulo é uma figura geométrica de três lados em que cada um dos lados é menor que a
    soma dos outros dois, faça um algoritmo que receba três valores e verifique se eles podem ser os comprimentos dos
    lados de um triângulo.
 */
import java.util.Scanner;

public class Ex45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lados[] = {0,0,0};
        int soma = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o " + (i+1) + " lado do triangulo");
            lados[i] = scanner.nextInt();
            soma += lados[i];
        }

        for (int i = 0; i < 3; i++) {
            if ((lados[i] >= soma - lados[i]) ||  (lados[i] <= 0)) {
                System.out.println("Nao podem ser lados de um triangulo");
                break;
            } else if (i == 2) {
                System.out.println("Podem ser lados de um triangulo");
            }
        }
    }
}
