package Repository;


import Cliente.Clientes;
import Model.ContaBancaria;
import java.util.List;

public interface ClientesRepository {
    /**
     * Cria uma conta na fake database
     *
     * @param contas
     */
    void create(Clientes contas);

    List<Clientes> readAll();

    void update(int id,Clientes contas);

    void Delete(int id);


}
