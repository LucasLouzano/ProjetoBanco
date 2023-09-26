package Repository;


import Model.ContaBancaria;
import java.util.List;

public interface Rendimento {
    /**
     * Cria uma conta na fake database
     *
     * @param conta
     */
    void create(ContaBancaria conta);

    List<ContaBancaria> readAll();

    void update(String numeroConta, ContaBancaria conta);

    void remove(String numeroConta);


}
