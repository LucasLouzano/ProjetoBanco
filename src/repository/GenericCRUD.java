package repository;

import model.Conta;

import java.util.List;

public interface GenericCRUD<T, v> {

    void create(T parametro);
    List<T> readAll();
    boolean update(String nome, Conta parametro);
    boolean delete(String nome);


}


