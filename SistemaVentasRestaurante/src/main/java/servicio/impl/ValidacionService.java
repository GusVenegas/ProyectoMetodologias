package servicio.impl;

import Modelo.Validacion;

public class ValidacionService implements IValidacionService {


    @Override
    public boolean validarCedula(String cedula) {
        return Validacion.validarCedula(cedula);
    }
    @Override
    public boolean validarNombre(String nombre){
        return Validacion.validarNombre(nombre);
    }

}
