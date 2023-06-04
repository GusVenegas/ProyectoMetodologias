package Modelo;

import lombok.*;

import java.util.ArrayList;
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pedido {
	private String hora;
    private ArrayList<Producto> listaProducto = new ArrayList();
	private int mesa;
    private int cantidad;
    private double subtotal = 0;

 
    public void agregarPedido(Producto product) {
    	listaProducto.add(product);
    }

	public double getSubtotal() {
		calcularSubTotal();
		return subtotal;
	}

	private void calcularSubTotal(){
		/*for(int i = 0; i < listaProducto.size(); i++ ) {
    		subtotal = subtotal + (listaProducto.get(i).getPrecio()* listaProducto.get(i).getCantidad());
    	}*/
		for(Producto producto : listaProducto){
			subtotal =subtotal+ (producto.getPrecio()*producto.getCantidad());
		}
    }
	
	
}
