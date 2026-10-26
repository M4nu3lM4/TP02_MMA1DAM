package org.iesalandalus.programacion.tp02;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Manuel Martínez 1º DAM//

        int numero;
        boolean esPrimo = true;
        do {
            System.out.print("Introduce un número de dos o mas cifras: ");
            numero = Entrada.entero();
        } while (numero < 10);
        for (int i = 2; i < numero && esPrimo; i++) {
            esPrimo = (numero % i != 0);
        }

        if (esPrimo){
            int reverso = 0;
            int numeroCifras = (int) Math.log10(numero) + 1;

            for (int i = 0; i < numeroCifras; i++){
                int cifra = numero / (int)Math.pow(10,i) %  10;
                reverso = reverso * 10 + cifra;
            }

            boolean reversoEsPrimo = true;
            for (int i = 2; i < reverso && reversoEsPrimo; i++){
                reversoEsPrimo = (reverso % i != 0);
            }

            if (reversoEsPrimo){
                System.out.println("El número "+numero+ " es OMIRP.");
            } else {
                System.out.println("El número "+numero+ " NO es OMIRP.");
            }
        }
        else {
            System.out.println(numero + " no puede ser OMIRP ya que no es primo.");
        }


    }
}
