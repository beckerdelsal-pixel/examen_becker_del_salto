package com.krakedev.examen.testJUnit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.krakedev.examen.entidades.Vendedor;
import com.krakedev.examen.entidades.VendedorComision;
import com.krakedev.examen.entidades.VendedorMixto;

public class VendedorTest {

	@Test
    public void testSueldoVendedor() {
        Vendedor v = new Vendedor("1711");
        v.setSueldoFijo(500.0);
        assertEquals(500.0, v.calcularSueldo(), 0.0);
    }

    @Test
    public void testSueldoComision() {
        VendedorComision vc = new VendedorComision("1722");
        vc.setComisionPorVenta(10.0);
        vc.setNumeroVentas(5);
        assertEquals(50.0, vc.calcularSueldo(), 0.0);
    }

    @Test
    public void testSueldoMixto() {
        VendedorMixto vm = new VendedorMixto("1733");
        vm.setSueldoFijo(1000.0);
        vm.setNumeroVentas(10);
        assertEquals(1100.0, vm.calcularSueldo(), 0.0);
    }

}
