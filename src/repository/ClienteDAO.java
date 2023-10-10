package repository;
import model.Cliente;
import java.util.List;
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
