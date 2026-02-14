/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora.java;

/**
 *
 * @author aliso
 */
public class Calculadora {

    // --- MÉTODOS CON 2 PARÁMETROS ---
    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int dividir(int a, int b) {
        // Nota: Al ser enteros, si b es 0 lanzará una excepción.
        return a / b;
    }

    // --- SOBRECARGA CON 3 PARÁMETROS ---
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    public int restar(int a, int b, int c) {
        return a - b - c;
    }

    public int multiplicar(int a, int b, int c) {
        return a * b * c;
    }

    // --- SOBRECARGA CON 4 PARÁMETROS ---
    public int sumar(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public int restar(int a, int b, int c, int d) {
        return a - b - c - d;
    }

    public int multiplicar(int a, int b, int c, int d) {
        return a * b * c * d;
    }
}