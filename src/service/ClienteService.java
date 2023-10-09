package service;
<<<<<<< HEAD
=======

import java.util.List;
>>>>>>> 0cdd496a33ff2e01b5a8b99630c4ba45c213eb5e

import model.Cliente;

import java.util.List;

public interface ClienteService {

    void create(Cliente conta);

    List<Cliente>readAll();

    boolean update(String id, Cliente conta);

    boolean delete(int id);
}
