package Practica2Iterativo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Pc
 */
public class Practica2Iterativo {

    public static int calcularMCD(int divisor, int dividendo) {
        while (dividendo != 0) {
            int num = dividendo;
            dividendo = divisor % dividendo;
            divisor = num;
        }
        return divisor;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese el primer numero:");
        int numero1 = Integer.parseInt(reader.readLine());

        System.out.println("Ingrese el segundo numero:");
        int numero2 = Integer.parseInt(reader.readLine());

        int resultado = calcularMCD(numero1, numero2);

        System.out.println("El Maximo Comun divisor de " + numero1 + " y " + numero2 + " es: " + resultado);

    }

}
