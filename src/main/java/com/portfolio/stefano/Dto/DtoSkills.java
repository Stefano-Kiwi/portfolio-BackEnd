package com.portfolio.stefano.Dto;

import jakarta.validation.constraints.NotBlank;

public class DtoSkills {
    @NotBlank
    private String nombre;
    @NotBlank
    private int porcentaje;

    public DtoSkills() {
    }

    public DtoSkills(String nombre, int porcentaje) {
        this.nombre = nombre;
        this.porcentaje = porcentaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    
}