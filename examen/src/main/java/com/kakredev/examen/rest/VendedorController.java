package com.kakredev.examen.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.krakedev.examen.entidades.Vendedor;
import com.krakedev.examen.servicios.AdminVentas;

@RestController
@RequestMapping("/vendedores")
public class VendedorController {

    private AdminVentas admin = new AdminVentas();

    @PostMapping("/agregar") 
    public void agregar(@RequestBody Vendedor vendedor) {
        admin.agregar(vendedor);
    }

    @GetMapping("/calcularSueldo/{cedula}") 
    public Double calcularSueldo(@PathVariable String cedula) {
        return admin.calcularSueldo(cedula);
    }
}
