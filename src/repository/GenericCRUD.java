package repository;

import java.util.List;

public interface GenericCRUD<T, v> {

    void create(T parametro);

    List<T> readAll();

    void update(v nome, T parametro);

    void delete(v nome);
}
