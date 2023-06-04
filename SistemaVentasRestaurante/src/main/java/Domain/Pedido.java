package Domain;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;

@Data
@Entity
@Table(name = "pedidos")
public class Pedido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "hora")
	private String hora;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "pedido_id")
	private ArrayList<Producto> listaProducto = new ArrayList<>();

	@Column(name = "num_mesa")
	private int mesa;

	@Column(name = "cantidad")
	private int cantidad;

	@Column(name = "subtotal")
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
