package Aplication;

import Domain.Cliente;
import Infrastucture.InputPort.IClientInputPort;
import Infrastucture.OutputAdapter.ClientRepository;
import Infrastucture.OutputPort.IClientRepository;

import java.util.ArrayList;

public class ClienteUseCase implements IClientInputPort {

    ClientRepository clientRepository= new ClientRepository();
    @Override
    public ArrayList<Cliente> getCustomers() {
        return null;
    }

    @Override
    public Cliente getById(Long id) {
        return null;
    }

    @Override
    public Cliente createCustomer(Cliente cliente) {
        System.out.println("aqui se guarda");
        clientRepository.create(cliente);
        return cliente;
    }


}
