package com.krakedev.examen.test;

import com.krakedev.examen.servicios.AdminVentas;

public class TestError {

	public static void main(String[] args) {
		AdminVentas admin = null;
		
		admin.agregar(null);
	}

}
