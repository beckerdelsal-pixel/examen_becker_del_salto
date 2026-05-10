package com.kakredev.examen.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.krakedev.examen.entidades.Vendedor;
import com.krakedev.examen.entidades.VendedorComision;
import com.krakedev.examen.entidades.VendedorMixto;
import com.krakedev.examen.servicios.AdminVentas;

@RestController
@RequestMapping("/vendedores")
public class VendedorController {

    private AdminVentas admin = new AdminVentas();

    @PostMapping("/agregar") 
    public void agregar(@RequestBody Vendedor vendedor) {
    	Vendedor realVendedor = null;
        
        if (vendedor.getTipo().equals("V")) {
            realVendedor = new Vendedor(vendedor.getCedula(), "V");
        } else if (vendedor.getTipo().equals("C")) {
            realVendedor = new VendedorComision(vendedor.getCedula(), "C");
        } else if (vendedor.getTipo().equals("M")) {
            realVendedor = new VendedorMixto(vendedor.getCedula(), "M");
        }

        if (realVendedor != null) {
            realVendedor.setSueldoFijo(vendedor.getSueldoFijo());
            realVendedor.setNumeroVentas(vendedor.getNumeroVentas());
            realVendedor.setComisionPorVenta(vendedor.getComisionPorVenta());
            
            admin.agregar(realVendedor);
        }
    }

    @GetMapping("/calcularSueldo/{cedula}") 
    public Double calcularSueldo(@PathVariable String cedula) {
        return admin.calcularSueldo(cedula);
    }
}
