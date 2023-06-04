package Infrastucture.OutputPort;

import Domain.Cliente;

import javax.persistence.Persistence;
import java.util.List;

public interface IClientRepository {

    public void  create(Cliente cliente);
}
