package com.krakedev.examen.servicios;

import java.util.ArrayList;

import com.krakedev.examen.entidades.Vendedor;

public class AdminVentas {
	private ArrayList<Vendedor> vendedores = new ArrayList<>();

    public void agregar(Vendedor vendedor) {
    	String t = vendedor.getTipo();
        if (t != null && (t.equals("V") || t.equals("C") || t.equals("M"))) {
            vendedores.add(vendedor);
        } else {
            System.out.println("Tipo de vendedor no válido: " + t);
        }
    }

    public Double calcularSueldo(String cedula) {

        for (Vendedor v : vendedores) {
            if (v.getCedula().equals(cedula)) {

                return v.calcularSueldo();
            }
        }

        return null;
    }
}
