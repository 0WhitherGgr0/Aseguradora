/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aseguradora;

/**
 *
 * @author USUARIO
 */
// Declaración de la clase CSeguro
public abstract class CSeguro {
    // Atributos
    protected int poliza;
    protected String nombre;
    protected double prima;
    protected String planSeguro;
    protected double cobertura;

    // Método constructor
    public CSeguro(int nPoliza, String cNombre, double nPrima, String cPlan) {
        poliza = nPoliza;
        nombre = cNombre;
        prima = nPrima;
        planSeguro = cPlan;
        cobertura = 0;
    }

    // Métodos abstractos
    public abstract double calcularCobertura();

    // Métodos de acceso y modificación
    public void colocarPoliza(int nPoliza) {
        poliza = nPoliza;
    }

    public int obtenerPoliza() {
        return poliza;
    }

    public void colocarNombre(String cNombre) {
        nombre = cNombre;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void colocarPrima(double nPrima) {
        prima = nPrima;
    }

    public double obtenerPrima() {
        return prima;
    }

    public void colocarPlanSeguro(String cPlan) {
        planSeguro = cPlan;
    }

    public String obtenerPlanSeguro() {
        return planSeguro;
    }

    public void colocarCobertura(double nCobertura) {
        cobertura = nCobertura;
    }

    public double obtenerCobertura() {
        return cobertura;
    }
}
