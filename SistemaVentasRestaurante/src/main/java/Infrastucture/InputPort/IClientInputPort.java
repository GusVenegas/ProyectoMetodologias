package Infrastucture.InputPort;

import Domain.Cliente;

import java.util.ArrayList;

public interface IClientInputPort {
    public ArrayList<Cliente> getCustomers();

    public Cliente getById(Long id);

    public Cliente createCustomer(Cliente cliente);
}
