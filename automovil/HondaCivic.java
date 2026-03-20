/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automovil;

/**
 *
 * @author aliso
 */
public class HondaCivic extends AutoMovil {

    // Constructor
    public HondaCivic() {
        super(); // Llama al constructor de la clase padre (AutoMovil)
        System.out.println("Constructor de HondaCivic");
    }

    // Sobrescritura de métodos de la clase padre
    @Override
    public void encender() {
        System.out.println("El Honda Civic está encendiendo con arranque deportivo...");
    }

    @Override
    public void acelerar() {
        System.out.println("El Honda Civic acelera rápidamente...");
    }
    
}
