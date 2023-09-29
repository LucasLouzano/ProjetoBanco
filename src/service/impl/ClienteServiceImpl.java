package Service.impl;

import java.util.List;

import model.Cliente;
import repository.ClienteDAO;
import repository.impl.ClienteDAOImpl;

public class ClienteServiceImpl implements ClienteService {

        private ClienteDAO repository = new ClienteDAOImpl();

        @Override
        public void create(Cliente Conta) {
            repository.create(Conta);
        }

        @Override
        public List<Cliente> readAll() {
            return repository.readAll();
        }

        @Override
        public List<Cliente> update(int id, Cliente Conta) {
            repository.update(id, Conta);
            return null;
        }

        @Override
        public List<Cliente> delete(int id) {
            repository.delete(id);
            return null;
        }

    }
