 package com.banco.gui;

public enum ConstantesGUI {
    MENU("\n" + //
            "===================\n" + //
            "Menu Funcionários\n" + //
            "1 - Cadastrar de Funcionários\n" + //
            "2 - Buscar Funcionários usando cpf\n" + //
            "3 - Listar todos Funcionários\n" + //
            "4 - Adicionar funcionario usando o cpf\n" + //
            "5 - Deletar Funcionários\n" + //
            "99 - Sair do Software"),
    CADASTRO("\n" + //);
            "===================\n" + //
            "Cadastro de Cliente\n" + //
            "1 - Cadastrar Novo Cliente\n" + //
            "2 - Buscar cliente usando o cpf\n" + //
            "3 - Listar todos os clientes\n" + //
            "4 - Adicionar cliente usando o cpf\n" + //
            "5 - Deletar Clientes \n" + //
            "99 - Sair do Software"),
    LOGIN("\n" + //);
            "===================\n" + //
            "Login do cliente\n" + //
            "1 - Entrar\n" + //
            "98 - Voltar ao Menu"),

    CADASTRARCONTA("\"\n" + //);
            "===================\n" + //
            "Cadastro  Conta\n" + //
            "1 - Cadastrar Conta\n" + //
            "2 - Buscar Contas usando cpf\n" + //
            "3 - Listar todas as Conta \n" + //
            "4 - Adicionar conta usando o cpf\n" + //
            "5 - Deletar Conta \n" + //
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
