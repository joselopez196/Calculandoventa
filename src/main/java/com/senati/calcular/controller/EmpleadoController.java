package com.senati.calcular.controller;

import com.senati.calcular.dto.EmpleadoRequest;
import com.senati.calcular.dto.EmpleadoReponse;
import com.senati.calcular.Service.CalcularValorNeto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/empleados")
public class EmpleadoController {
    private final CalcularValorNeto calcularValorNetoService;

    public EmpleadoController(CalcularValorNeto calcularValorNetoService) {
        this.calcularValorNetoService = calcularValorNetoService;
    }

    @PostMapping("/calcular")
    public ResponseEntity<EmpleadoReponse> calcularPost(@RequestBody EmpleadoRequest request){
        EmpleadoReponse reponse = calcularValorNetoService.calcular(request);
        return ResponseEntity.ok(reponse);
    }

    @GetMapping("/calcular")
    public ResponseEntity<EmpleadoReponse> calcularGet(
            @RequestParam double sueldoBase,
            @RequestParam int horasTrabajadas){
        EmpleadoRequest request = new EmpleadoRequest(sueldoBase, horasTrabajadas);
        EmpleadoReponse reponse = calcularValorNetoService.calcular(request);
        return ResponseEntity.ok(reponse);
    }
}
