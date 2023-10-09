package repository;
import model.Cliente;

import java.util.List;

<<<<<<< HEAD
=======
import model.Cliente;

>>>>>>> 0cdd496a33ff2e01b5a8b99630c4ba45c213eb5e
//TODO exteds do GenericCRUD
public interface ClienteDAO {
        /**
         * Cria uma conta na fake data
         *
         * @param conta
         * @return
         */
        void create(Cliente conta);

        List<Cliente> readAll();

        boolean update(String id, Cliente conta);

        boolean delete(int id);

}
