package Modelo;

import org.junit.Test;

import static org.junit.Assert.*;

public class FacturaTest {
    @Test
    public void descuento(){
        Factura factura = new Factura(new Cliente(), new Pedido());
        factura.total = 30;
        double esperado = 27;
        double obtenido = factura.calcularDescuento();
        assertEquals(esperado,obtenido,0.1);
    }

}