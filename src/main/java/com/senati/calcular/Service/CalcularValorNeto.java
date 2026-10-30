package com.senati.calcular.Service;

import com.senati.calcular.dto.EmpleadoReponse;
import com.senati.calcular.dto.EmpleadoRequest;
import org.springframework.stereotype.Service;

@Service
public class CalcularValorNeto {
    public EmpleadoReponse calcular(EmpleadoRequest request){
        double sueldoBase = request.getSueldoBase();
        int horasTRabajadas = request.getHorasTrabajadas();

        double descuento = 0.0;
        double bonificacion = 0.0;

        if (sueldoBase > 2500){
            descuento = sueldoBase * 0.08;
        }else if (sueldoBase <= 1200) {
            descuento = 0.0;
        }

        if (horasTRabajadas > 8){
            bonificacion = 300.0;
        }

        double valorNeto = sueldoBase - descuento + bonificacion;
        return new EmpleadoReponse(sueldoBase, descuento, bonificacion, valorNeto);
    }
}
