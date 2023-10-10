package repository;

import java.util.List;

public interface GenericCRUD<T, v> {

    void create(T parametro);

    List<T> readAll();
    boolean update(v nome,T parametro);
    boolean delete(String nome);

}

