 package gui;

public enum ConstantesGUI {
    MENU("\"\n" + //
            "===================\n" + //
            "Menu Funcionários\n" + //
            "1 - Cadastrar Funcionário\n" + //
            "2 - Buscar Funcionário\n" + //
            "3 - Listar todos os funcionários\n" + //
            "99 - Sair do Software"),
    CADASTRO("\"\n" + //);
            "===================\n" + //
            "Cadastro  Cliente\n" + //
            "1 - Cadastrar Cliente\n" + //
            "2 - Buscar Cliente\n" + //
            "3 - Listar todos os Clientes\n" + //
            "99 - Sair do Software"),
    CADASTROCONTA("\"\n" + //);
            "===================\n" + //
            "Cadastro  Conta\n" + //
            "1 - Cadastrar Conta\n" + //
            "2 - Buscar Conta\n" + //
            "3 - Listar todas as Contas \n" + //
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
