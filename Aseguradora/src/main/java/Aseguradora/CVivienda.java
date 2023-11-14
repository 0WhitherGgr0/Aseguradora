/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aseguradora;

/**
 *
 * @author USUARIO
 */
// Declaración de la clase CVivienda
public class CVivienda extends CSeguro {
    // Atributos adicionales
    private String ubicacion;
    private double precio;
    private double porcentaje;

    // Constructor
    public CVivienda(int nPoliza, String cNombre, double nPrima, String cPlan, String cUbicacion, double nPrecio, double nPorcentaje) {
        super(nPoliza, cNombre, nPrima, cPlan);
        ubicacion = cUbicacion;
        precio = nPrecio;
        porcentaje = nPorcentaje;
    }

    // Métodos de acceso y modificación adicionales
    public void colocarUbicacion(String cUbicacion) {
        ubicacion = cUbicacion;
    }

    public String obtenerUbicacion() {
        return ubicacion;
    }

    public void colocarPrecio(double nPrecio) {
        precio = nPrecio;
    }

    public double obtenerPrecio() {
        return precio;
    }

    public void colocarPorcentaje(double nPorcentaje) {
        porcentaje = nPorcentaje;
    }

    public double obtenerPorcentaje() {
        return porcentaje;
    }

    // Sobrescritura del método calcularCobertura
    @Override
    public double calcularCobertura() {
        return precio * porcentaje;
    }
}

