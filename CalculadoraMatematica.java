/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package calculadoramatematica;

import java.util.Scanner;

/**
 * La clase CalculadoraMatematica implementa operaciones aritméticas básicas
 * (suma, resta, multiplicación y división) siguiendo principios de POO.
 * Incluye un menú interactivo en consola para la gestión de las operaciones.
 * * @author TuNombre
 * @version 1.0
 */
public class CalculadoraMatematica {

    // Atributos Privados
    private double numero1;
    private double numero2;

    /**
     * Constructor por defecto.
     * Inicializa una nueva instancia de la calculadora.
     */
    public CalculadoraMatematica() {
        // Los atributos de tipo double se inicializan en 0.0 por defecto
    }

    /**
     * Establece los valores de los dos números sobre los cuales se realizarán las operaciones.
     * * @param n1 El primer número (operando 1).
     * @param n2 El segundo número (operando 2).
     */
    public void establecerNumeros(double n1, double n2) {
        this.numero1 = n1;
        this.numero2 = n2;
    }

    /**
     * Calcula la suma de los dos números almacenados.
     * Lógica: numero1 + numero2
     * * @return El resultado de la suma.
     */
    public double sumar() {
        return this.numero1 + this.numero2;
    }

    /**
     * Calcula la resta de los dos números almacenados.
     * Lógica: numero1 - numero2
     * * @return El resultado de la resta.
     */
    public double restar() {
        return this.numero1 - this.numero2;
    }

    /**
     * Calcula la multiplicación de los dos números almacenados.
     * Lógica: numero1 * numero2
     * * @return El resultado de la multiplicación.
     */
    public double multiplicar() {
        return this.numero1 * this.numero2;
    }

    /**
     * Realiza la división de los dos números almacenados.
     * Incluye una validación para evitar la división por cero.
     * * @return El resultado de la división o 0.0 si el divisor es cero (imprimiendo un error).
     */
    public double dividir() {
        // Validación con IF para manejar la división por cero
        if (this.numero2 == 0) {
            System.out.println("Error: No se puede dividir por cero.");
            return 0.0;
        } else {
            return this.numero1 / this.numero2;
        }
    }

    /**
     * Método principal que ejecuta la aplicación de consola.
     * Contiene el bucle del menú y la lógica de interacción con el usuario.
     * * @param args Argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        // Instancia de la clase Scanner para lectura de datos
        Scanner scanner = new Scanner(System.in);
        // Instancia de nuestra calculadora
        CalculadoraMatematica calculadora = new CalculadoraMatematica();
        
        int opcionMenu;

        // Bucle do-while para mantener el menú activo
        do {
            System.out.println("\n===== CALCULADORA MATEMÁTICA =====");
            System.out.println("1. Ingresar números");
            System.out.println("2. Sumar");
            System.out.println("3. Restar");
            System.out.println("4. Multiplicar");
            System.out.println("5. Dividir");
            System.out.println("0. Salir");
            System.out.println("==================================");
            System.out.print("Seleccione una opción: ");

            // Validación básica para asegurar que se ingresa un entero
            if (scanner.hasNextInt()) {
                opcionMenu = scanner.nextInt();
            } else {
                opcionMenu = -1; // Valor inválido
                scanner.next(); // Limpiar el buffer del scanner
            }

            // Estructura switch para manejar las opciones
            switch (opcionMenu) {
                case 1:
                    System.out.print("\nIngrese el primer número: ");
                    while (!scanner.hasNextDouble()) { // Validación de entrada
                        System.out.print("Entrada inválida. Ingrese un número: ");
                        scanner.next();
                    }
                    double num1 = scanner.nextDouble();

                    System.out.print("Ingrese el segundo número: ");
                    while (!scanner.hasNextDouble()) { // Validación de entrada
                        System.out.print("Entrada inválida. Ingrese un número: ");
                        scanner.next();
                    }
                    double num2 = scanner.nextDouble();

                    // Uso del método setter
                    calculadora.establecerNumeros(num1, num2);
                    System.out.println("Números ingresados correctamente.");
                    break;

                case 2:
                    System.out.println("Resultado de la suma: " + calculadora.sumar());
                    break;

                case 3:
                    System.out.println("Resultado de la resta: " + calculadora.restar());
                    break;

                case 4:
                    System.out.println("Resultado de la multiplicación: " + calculadora.multiplicar());
                    break;

                case 5:
                    // La validación de cero se hace dentro del método dividir()
                    double resultado = calculadora.dividir();
                    // Solo imprimimos si el divisor no era cero (o si aceptamos 0.0 como error visual)
                    // Nota: Si el método imprimió el error, aquí imprimirá 0.0.
                    if (resultado != 0.0 || calculadora.sumar() - calculadora.sumar() == 0) {
                         // Una forma simple de mostrar el resultado siempre:
                         System.out.println("Resultado de la división: " + resultado);
                    }
                    break;

                case 0:
                    System.out.println("¡Gracias por usar la calculadora!");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor intente de nuevo.");
                    break;
            }

        } while (opcionMenu != 0);

        // Cerrar el scanner para liberar recursos
        scanner.close();
    }
}
