package com.krakedev.examen.test;

import com.krakedev.examen.entidades.Vendedor;

public class TestVendedor {

	public static void main(String[] args) {
		Vendedor v1 = new Vendedor("0987654321");
        
        //Setear datos 
        v1.setSueldoFijo(500.0);
        v1.setNumeroVentas(10);
        
        //Imprimir el objeto 
        System.out.println("Datos del Vendedor:");
        System.out.println(v1);
	}

}
