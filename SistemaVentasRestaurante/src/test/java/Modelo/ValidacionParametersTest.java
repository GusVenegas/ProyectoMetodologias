package Modelo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

@RunWith(value = Parameterized.class)
public class ValidacionParametersTest {
    private String email;
    @Parameterized.Parameters
    public static Iterable<String> parameters(){
        List<String> objects = new ArrayList<String>();
        objects.add("aaa@gmail.com");
        objects.add("genaro@gmail.com.ec");
        objects.add("master.main@hormail.com");
        objects.add("Cazuu_Love@outlook.es");
        objects.add("133@gmail.com");
        objects.add(".@gmail.com");
        objects.add("1@gmail.com");
        return objects;
    }
    public  ValidacionParametersTest(String email){
        this.email = email;
    }
    @Test
    public void given_parameters_when_email_validation_ok_then(){
        Validacion validacion = new Validacion();
        assertTrue(validacion.validarCorreoElectronico(email));
    }


}