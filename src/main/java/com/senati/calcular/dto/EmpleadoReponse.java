package com.senati.calcular.dto;

public class EmpleadoReponse {
    private double sueldoBase;
    private double descuentoOchoPorciento;
    private double bonificacionHorasExtra;
    private double valorNeto;

    public EmpleadoReponse(){
    }

    public EmpleadoReponse(double sueldoBase, double descuentoOchoPorciento, double bonificacionHorasExtra, double valorNeto){
        this.sueldoBase = sueldoBase;
        this.descuentoOchoPorciento = descuentoOchoPorciento;
        this.bonificacionHorasExtra = bonificacionHorasExtra;
        this.valorNeto = valorNeto;
    }

    public double getSueldoBase(){
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase){
        this.sueldoBase = sueldoBase;
    }

    public void setDescuentoOchoPorciento(double ochoPorciento){
        this.descuentoOchoPorciento = descuentoOchoPorciento;
    }

    public double getBonificacionHorasExtra(){
        return bonificacionHorasExtra;
    }

    public void setBonificacionHorasExtra(double bonificacionHorasExtra) {
        this.bonificacionHorasExtra = bonificacionHorasExtra;
    }

    public double getValorNeto(){
        return valorNeto;
    }

    public void setValorNeto(){
        this.valorNeto = valorNeto;
    }
}
