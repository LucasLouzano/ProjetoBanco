package com.banco.estudo;
import com.banco.config.ClienteConfig;
import com.banco.controller.ClienteController;

public class TesteClienteDelete {
    public static void main(String[] args) {
        ClienteConfig.clienteInit();
        ClienteController contro = new ClienteController();
        boolean clientedelete = contro.delete("22345678978");
        if (clientedelete) {
            System.out.println("Cliente removido com sucesso!");
        } else {
            System.out.println("Cliente não encontrado, ou não foi possível remover.");
        }
        contro.readAll().forEach(f -> {
            System.out.println(f.getNome());
        });
    }
}
