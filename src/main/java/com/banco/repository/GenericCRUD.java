package com.banco.repository;

import java.util.List;

public interface GenericCRUD<T, v> {

    void create(T parametro);

    List<T> readAll();

    T read(v id);

    boolean update(v nome, T conta);

    boolean delete(v id);

}
