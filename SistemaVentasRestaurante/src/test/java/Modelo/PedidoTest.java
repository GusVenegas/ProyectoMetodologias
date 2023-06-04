package Modelo;

import org.junit.Test;

import static org.junit.Assert.*;

public class PedidoTest {
    @Test
    public void given_an_product_when_getting_total_then(){
        Pedido pedido = new Pedido();
        pedido.agregarPedido(new Producto(001, "hamburguesa", 2.00, 2));
        assertEquals(4.00, pedido.getSubtotal(), 0.2);
    }


}
