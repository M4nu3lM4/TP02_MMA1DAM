package org.iesalandalus.programacion.tp02;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Manuel Martínez 1º DAM//

        int numero;
        int sumaCifras = 0;
        int cifraMenor = 10;
        int cifraMayor = 0;

        do {
            System.out.print("Introduce un número con más de tres cifras: ");
            numero = Entrada.entero();
        }while (numero <= 999);

        int numeroCifras = (int) Math.log10(numero) + 1;

        for (int i = numeroCifras - 1; i >= 0; i--) {
            int cifra = numero / (int)Math.pow(10, i) % 10;

            if (cifra < cifraMenor){
                cifraMenor = cifra;
            }
            if (cifra > cifraMayor){
                cifraMayor = cifra;
            }

            sumaCifras += (int) Math.pow(cifra, 1);

        }
        System.out.print("Para el número: "+numero+ ", la cifra mayor es: "+cifraMayor+ " la menor es: "+cifraMenor+ " La suma de las cifras es: "+sumaCifras);
    }
}
