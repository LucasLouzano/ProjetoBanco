 package com.banco.gui;

public enum ConstantesGUI {
    MENU("\n" + //
            "===================\n" + //
            "Menu Funcionários\n" + //
            "1 - Cadastrar de Funcionários\n" + //
            "2 - Buscar Funcionários\n" + //
            "3 - Listar todos Funcionários\n" + //
            "4 - Deletar Funcionários\n" + //
            "99 - Sair do Software"),
    CADASTRO("\n" + //);
            "===================\n" + //
            "Cadastro de Cliente\n" + //
            "1 - Cadastrar Cliente\n" + //
            "2 - Buscar Clientes\n" + //
            "3 - Listar todos os Clientes\n" + //
            "4 - Deletar Clientes \n" + //
            "99 - Sair do Software"),
    CADASTRARCONTA("\"\n" + //);
            "===================\n" + //
            "Cadastro  Conta\n" + //
            "1 - Cadastrar Conta\n" + //
            "2 - Buscar Contas\n" + //
            "3 - Listar todas as Conta \n" + //
            "4 - Deletar Conta \n" + //
            "99 - Sair do Software");
    {

    }
    private String valor;

    public String getValor() {
        return valor;
    }

    ConstantesGUI(String valor) {
        this.valor = valor;
    }
}
