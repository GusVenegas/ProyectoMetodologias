package servicio.impl;

import Modelo.Cliente;
import Modelo.ClienteDAO;
import Modelo.Validacion;
import servicio.IClienteService;

public class ClienteService implements IClienteService {

    private ClienteDAO dao;

    public ClienteService() {
        this.dao = new ClienteDAO();
    }

    @Override
    public void create(Cliente cliente) throws Exception {
        boolean validar = Validacion.validarCedula(cliente.getCedula());
        boolean validarNombre = Validacion.validarNombre(cliente.getCedula());
        if (!validar) {
            throw new Exception("Error numero de cedula incorrecto");
        }
        dao.create(cliente);
    }
}