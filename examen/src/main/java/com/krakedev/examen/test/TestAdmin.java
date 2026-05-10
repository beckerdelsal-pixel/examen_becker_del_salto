package com.krakedev.examen.test;

import com.krakedev.examen.entidades.Vendedor;
import com.krakedev.examen.entidades.VendedorComision;
import com.krakedev.examen.entidades.VendedorMixto;
import com.krakedev.examen.servicios.AdminVentas;

public class TestAdmin {

	public static void main(String[] args) {
		AdminVentas admin = new AdminVentas();

        Vendedor v = new Vendedor("111");
        v.setSueldoFijo(500.0);

        VendedorComision vc = new VendedorComision("222");
        vc.setComisionPorVenta(20.0);
        vc.setNumeroVentas(10);

        VendedorMixto vm = new VendedorMixto("333");
        vm.setSueldoFijo(1000.0);
        vm.setNumeroVentas(5);

        admin.agregar(v);
        admin.agregar(vc);
        admin.agregar(vm);

        System.out.println("Sueldo Vendedor (111): " + admin.calcularSueldo("111"));
        System.out.println("Sueldo Comisión (222): " + admin.calcularSueldo("222"));
        System.out.println("Sueldo Mixto (333): " + admin.calcularSueldo("333"));

        System.out.println("Sueldo Inexistente (999): " + admin.calcularSueldo("999"));
	}

}
