package Modelo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

@RunWith(value = Parameterized.class)
public class ValidacionParametersTestNames {

    private String nombre;


    @Parameterized.Parameters
    public static Iterable<String> parameters(){
        List<String> objects = new ArrayList<String>();
        objects.add("Carolina");
        objects.add("Luis");
        objects.add("Jorge");
        objects.add("Lucia");
        objects.add("Pato");

        return objects;
    }
    public ValidacionParametersTestNames(String nombre){
        this.nombre= nombre;
    }
    @Test
    public void given_parameters_when_nombre_validation_ok_then(){
        Validacion validacion = new Validacion();
        assertTrue(validacion.validarNombre(nombre));
    }

}