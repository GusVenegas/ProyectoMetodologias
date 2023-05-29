package Modelo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@Entity
@Table(name = "producto")
public class Producto {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    
    @Column(name = "nombre")
    String nombre;
    
    @Column(name = "precio")
    double precio;
    
    @Column(name = "cantidad")
    Integer cantidad;
    
    private double descuentoProducto(double precio, int cantidad){
    	int temp = cantidad;
    	if(cantidad>5) {
    		temp -= 1;
    	}
    	for(int i = 0 ; i==temp ; i++) {
    		precio += precio * temp;
    	}
    	return precio;
    }
    
    public String consultarStockBajo() {
    	return (cantidad<=10)? "Stock agotandose, quedan "  + this.cantidad + " unidades" : "Aún queda stock suficiente";    	
    }
    
}
