package Modelo;

public class Factura {
   
    double total;
    Cliente customer;
    Pedido pedido;
    OrdenPedidos pedidos;
    int numFactura;
    
    public  Factura(Cliente client, Pedido pedido) {
        this.customer = client;
        this.pedido = pedido;
    }
    public void emitirFactura(){

    	pedido.getSubtotal();
        this.pedidos = new OrdenPedidos();
        pedidos.generarOrden();	    	
    }
    
    
 public  double calcularTotal(Pedido pedido) {
    	
    	total= pedido.getSubtotal()+(pedido.getSubtotal()* 0.12);
    	
		return calcularDescuento();
	}
 
 public double calcularDescuento() {
  double aplicarDescuento=total;
  
 	 	if(total>20) {
 		
 		aplicarDescuento= total-(total*0.1);
 				
 	}
		return aplicarDescuento;
	}
    
    
    
   

}






















