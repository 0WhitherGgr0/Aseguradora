/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aseguradora;

/**
 *
 * @author USUARIO
 */
// Declaración de la clase CMedico
public class CMedico extends CSeguro {
    // Atributos adicionales
    private int edad;
    private String salud;

    // Constructor
    public CMedico(int nPoliza, String cNombre, double nPrima, String cPlan, int nEdad, String cSalud) {
        super(nPoliza, cNombre, nPrima, cPlan);
        edad = nEdad;
        salud = cSalud;
    }

    // Métodos de acceso y modificación adicionales
    public void colocarEdad(int nEdad) {
        edad = nEdad;
    }

    public int obtenerEdad() {
        return edad;
    }

    public void colocarSalud(String cSalud) {
        salud = cSalud;
    }

    public String obtenerSalud() {
        return salud;
    }

    // Sobrescritura del método calcularCobertura
    @Override
    public double calcularCobertura() {
        double prima = obtenerPrima();

        if (edad > 80) {
            colocarCobertura(prima * 100);
        } else if (edad > 60) {
            colocarCobertura(prima * 200);
        } else if (edad > 40) {
            colocarCobertura(prima * 300);
        } else {
            colocarCobertura(prima * 400);
        }

        if (salud.equals("normal")) {
            colocarCobertura(obtenerCobertura() * 2);
        } else {
            colocarCobertura(obtenerCobertura() / 2);
        }

        return obtenerCobertura();
    }
}
