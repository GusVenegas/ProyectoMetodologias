package Modelo;

import org.junit.Test;

import static org.junit.Assert.*;

public class PedidoTest {
    @Test
    public void given_an_product_when_getting_total_then(){
        Pedido pedido = new Pedido();
        pedido.agregarPedido(Producto.builder().id(1).cantidad(2).nombre("Poliburguer").precio(2.00).build());
        assertEquals(4.00, pedido.getSubtotal(), 0.2);
    }


}
