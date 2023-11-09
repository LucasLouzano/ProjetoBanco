package com.banco.estudo;
import com.banco.config.ContaConfig;
import com.banco.controller.ContaController;
public class TesteDeleteConta {
    public static void main(String[] args) {
        ContaConfig.contaInit();
        ContaController contro = new ContaController();
        boolean contadelete = contro.delete("22345678978");
        if (contadelete) {
            System.out.println("conta removida, com sucesso!");
        } else {
            System.out.println("Conta não encontrada, ou não foi possível remover.");
        }
        contro.readAll().forEach(f -> {
            System.out.println(f.getNome());
        });
    }
}
