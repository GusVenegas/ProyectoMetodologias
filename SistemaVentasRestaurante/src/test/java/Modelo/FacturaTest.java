package Modelo;

import org.junit.Test;

import static org.junit.Assert.*;

public class FacturaTest {
    @Test
    public void give_sale_when_total_more_than_20(){
        Factura factura = new Factura(new Cliente(), new Pedido());
        factura.setTotal( 30);
        double esperado = 27;
        double obtenido = factura.calcularDescuento();
        assertEquals(esperado,obtenido,0.1);
    }

}