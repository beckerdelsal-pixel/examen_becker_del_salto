package com.krakedev.examen.test;

import com.krakedev.examen.entidades.Vendedor;
import com.krakedev.examen.servicios.AdminVentas;

public class TestError {

	public static void main(String[] args) {
		AdminVentas admin =  new AdminVentas();
		
		Vendedor v = new Vendedor("0987654321","V");
		
		admin.agregar(v);
		
		System.out.println("El vendedor se agrego correctamente...");
		System.out.println(v);
	}

}
