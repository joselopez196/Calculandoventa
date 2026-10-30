package com.senati.calcular.dto;

public class EmpleadoRequest {
    private double sueldoBase;
    private int horasTrabajadas;

    public EmpleadoRequest(){
    }

    public EmpleadoRequest(double sueldoBase, int horasTrabajadas){
        this.sueldoBase = sueldoBase;
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getSueldoBase(){
        return sueldoBase;
    }

    public void setSueldoBase(){
        this.sueldoBase = sueldoBase;
    }

    public int getHorasTrabajadas(){
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas){
        this.horasTrabajadas = horasTrabajadas;
    }
}
