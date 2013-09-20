/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.daw2.ejer1;

/**
 *
 * @author Droeko
 */
public class Persona {

    private String nombre;
    private String ap1;
    private Sexo sexo;
    private String DNI;

    public Persona(String DNI, String nombre, String Ap1, Sexo sexo) {

        this.nombre = nombre;
        this.ap1 = Ap1;
        this.sexo = sexo;
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public String getAp1() {
        return ap1;
    }

    public void setAp1(String Ap1) {
        this.ap1 = Ap1;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombreCompleto() {
        return nombre + " " + ap1 + " " + sexo + " " + " " + DNI;
    }
}
