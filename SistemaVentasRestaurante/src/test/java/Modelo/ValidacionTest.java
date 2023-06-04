package Modelo;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidacionTest {
    @Test
    public void give_cedula_when_validate_correct_then(){
        Validacion validacion = new Validacion();
         /*String numCedula = "0876";
       boolean asignado = validacion.validarCedula(numCedula);
       assertFalse(asignado);*/
        assertFalse(validacion.validarCedula("0192"));

    }

    @Test
    public void give_cedula_when_validate_incorrect_then(){
        Validacion validacion = new Validacion();
        String numCedula = "1726004615";
        boolean asignado = validacion.validarCedula(numCedula);
        assertTrue(asignado);
    }
    @Test
    public void give_name_when_validate_correct_then(){
        Validacion validacion = new Validacion();
        String nombre = "Daniel";
        boolean asignado = validacion.validarNombre(nombre);
        assertTrue(asignado);
    }
    @Test
    public void give_lastname_when_validate_correct_then(){
        Validacion validacion = new Validacion();
        String apellido = "Vargas";
        boolean asignado = validacion.validarApellido(apellido);
        assertTrue(asignado);
    }
    @Test
    public void give_address_lenght_when_validate_incorrect_then(){

        Validacion validacion = new Validacion();
        String address = "casa"; //Dirección incorrecta, corta
        boolean asignado = validacion.validarDireccion(address);
        assertFalse(asignado);
    }
    @Test
    public void give_email_when_validate_correct_then(){
        Validacion validacion = new Validacion();
        String correo = "theadmin@gmail.com";
        boolean asignado = validacion.validarCorreoElectronico(correo);
        assertTrue(asignado);
    }



}