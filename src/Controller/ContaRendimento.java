package Controller;

import Model.ContaBancaria;
import Repository.Rendimento;

import java.util.ArrayList;
import java.util.List;

public class ContaRendimento implements Rendimento {
    private static List<ContaBancaria> dataBase;

    public ContaRendimento() {
        if (dataBase == null) {
            dataBase = new ArrayList<>();
        }
    }

    @Override
    public void create(ContaBancaria conta) {
        dataBase.add(conta);
    }

    @Override
    public List<ContaBancaria> readAll() {
        return dataBase;
    }

    @Override
    public void update(String numeroConta, ContaBancaria conta) {

    }

    @Override
    public void remove(String numeroConta) {


    }

}
