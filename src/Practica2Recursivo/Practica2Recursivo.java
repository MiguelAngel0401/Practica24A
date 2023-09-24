package Practica2Recursivo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Pc
 */
public class Practica2Recursivo {

    public static int calcularMCD(int divisor, int dividendo) {
        if (dividendo == 0) {
            return divisor;
        } else {
            return calcularMCD(dividendo, divisor % dividendo);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese el primer numero:");
        int numero1 = Integer.parseInt(reader.readLine());

        System.out.println("Ingrese el segundo numero:");
        int numero2 = Integer.parseInt(reader.readLine());

        int resultado = calcularMCD(numero1, numero2);

        System.out.println("El Maximo Comun Divisor de " + numero1 + " y " + numero2 + " es: " + resultado);
    }
}
