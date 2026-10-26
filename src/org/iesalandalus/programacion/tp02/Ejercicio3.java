package org.iesalandalus.programacion.tp02;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Ejercicio3 {
    public static void main(String[] args) {
        //Manuel Martínez 1º DAM//
        int numero1;
        int numero2;
        do {
            do {
                System.out.print("Introduce un número: ");
                numero1 = Entrada.entero();
            } while (numero1 <= 0);

            do {
                System.out.print("Introduce otro número: ");
                numero2 = Entrada.entero();
            } while (numero2 <= 0);

            if (numero1 == numero2) {
                System.out.println("ERROR: Los números no puede ser iguales. Vuelve.a intentarlo.");
            }
        } while (numero1 == numero2);

        int sumaDivisoresNumero1 = 0;
        for (int i = 1; i < numero1; i++) {
            if (numero1 % i == 0) {
                sumaDivisoresNumero1 += i;
            }
        }

        int sumaDivisoresNumero2 = 0;
        for (int i = 1; i < numero2; i++) {
            if (numero2 % i == 0) {
                sumaDivisoresNumero2 += i;
            }
        }

        if (sumaDivisoresNumero1 == numero2 && sumaDivisoresNumero2 == numero1){
            System.out.println("Los números " + numero1 + " y " + numero2 + " son amigos.");
        }else {
            System.out.println("Los números " + numero1 + " y " + numero2 + " NO son amigos.");
        }

    }
}
