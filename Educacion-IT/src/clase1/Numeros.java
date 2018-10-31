package clase1;

import java.util.Scanner;

public class Numeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[50];
        int indiceNumeros = 0;
        int numero = -1;

/*        do {
            numero = scanner.nextInt();
            if (numero != 0)
                numeros[indiceNumeros++] = numero;
        } while (indiceNumeros < 50 && numero!=0);*/

        System.out.println("Ingresar números");
        numero = scanner.nextInt();
        while (indiceNumeros < 50 && numero!=0) {
            numeros[indiceNumeros++] = numero;
            System.out.println("Ingresar números");
            numero = scanner.nextInt();
        }

        int[] numerosPositivos = new int[numeros.length];
        int punteroPositivo = 0;

        int[] numerosNegativos = new int[numeros.length];
        int punteroNegativo = 0;


        for (int i = 0; i < indiceNumeros; i++) {
            if (numeros[i] > 0) {
                numerosPositivos[punteroPositivo++] = numeros[i];
            } else if (numeros[i] < 0){
                numerosNegativos[punteroNegativo++] = numeros[i];
            }
        }

        for (int i = 0; i < punteroPositivo; i++) {
            System.out.print(numerosPositivos[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < punteroNegativo; i++) {
            System.out.print(numerosNegativos[i] + " ");
        }

        System.out.println();
    }
}
