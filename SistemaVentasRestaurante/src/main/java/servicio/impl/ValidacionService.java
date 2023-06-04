package servicio.impl;

import Modelo.Validacion;
import servicio.IValidacionService;

public class ValidacionService implements IValidacionService {


    @Override
    public boolean validarCedula(String cedula) {
        return Validacion.validarCedula(cedula);
    }

}
