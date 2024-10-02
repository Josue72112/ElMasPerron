/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.definicionesinvestigacion.main;

import jakarta.faces.bean.RequestScoped;
import jakarta.inject.Named;

/**
 *
 * @author josue
 */
@Named 
@RequestScoped
public class Temas {

    public Temas() {
        nombre = "Josue Uziel Renteria Lopez";
        carrera = "Ingeniero en TICS";
        lenguaje = "HTML";
        baseDeDatos = "MySQL";
        proyectoR = "Sofware de Tienda";
        promedio = "9.9";
        
    }
    
    
    private String nombre;
    private String carrera;
    private String lenguaje;
    private String baseDeDatos;
    private String proyectoR;
    private String promedio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public String getBaseDeDatos() {
        return baseDeDatos;
    }

    public void setBaseDeDatos(String baseDeDatos) {
        this.baseDeDatos = baseDeDatos;
    }

    public String getProyectoR() {
        return proyectoR;
    }

    public void setProyectoR(String proyectoR) {
        this.proyectoR = proyectoR;
    }

    public String getPromedio() {
        return promedio;
    }

    public void setPromedio(String promedio) {
        this.promedio = promedio;
    }





}
