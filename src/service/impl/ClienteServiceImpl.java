package Service.impl;

import java.util.List;

import model.Cliente;
import repository.ClienteDAO;
import repository.impl.ClienteDAOImpl;

import static java.util.Collections.replaceAll;

public class ClienteServiceImpl implements ClienteService {

        private ClienteDAO repository = new ClienteDAOImpl();

        @Override
        public void create(Cliente cliente) {
            repository.create(cliente);
        }

        @Override
        public List<Cliente> readAll() {
            return repository.readAll();
        }

        @Override
        public void update(int id, Cliente cliente) {
            repository.update(id, cliente);
        }

        @Override
        public void delete(int id) {
            repository.delete(id);
        }

    }
