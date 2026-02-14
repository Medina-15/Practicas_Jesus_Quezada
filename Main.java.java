/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author aliso
 */
public class Main {
    public static void main(String[] args) {
        // Instancia de la clase Calculadora
        Calculadora calc = new Calculadora();

        System.out.println("--- PRUEBAS CON 2 PARÁMETROS ---");
        System.out.println("Suma: " + calc.sumar(5, 3));
        System.out.println("Resta: " + calc.restar(10, 4));
        System.out.println("Multiplicación: " + calc.multiplicar(6, 7));
        System.out.println("División: " + calc.dividir(20, 4));

        System.out.println("\n--- PRUEBAS CON 3 PARÁMETROS (SOBRECARGA) ---");
        System.out.println("Suma: " + calc.sumar(5, 3, 2));
        System.out.println("Resta: " + calc.restar(10, 4, 2));
        System.out.println("Multiplicación: " + calc.multiplicar(2, 3, 4));

        System.out.println("\n--- PRUEBAS CON 4 PARÁMETROS (SOBRECARGA) ---");
        System.out.println("Suma: " + calc.sumar(1, 2, 3, 4));
        System.out.println("Resta: " + calc.restar(20, 5, 3, 2));
        System.out.println("Multiplicación: " + calc.multiplicar(2, 2, 2, 2));
    }
}
