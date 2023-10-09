package repository;

<<<<<<< HEAD
import model.Conta;

=======
>>>>>>> 0cdd496a33ff2e01b5a8b99630c4ba45c213eb5e
import java.util.List;

public interface GenericCRUD<T, v> {

    void create(T parametro);
<<<<<<< HEAD
    List<T> readAll();
    boolean update(String nome, Conta parametro);
    boolean delete(String nome);


}


=======

    List<T> readAll();

    void update(v nome, T parametro);

    void delete(v nome);
}
>>>>>>> 0cdd496a33ff2e01b5a8b99630c4ba45c213eb5e
