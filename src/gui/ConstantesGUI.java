package gui;

public enum ConstantesGUI {
    MENU("\"\n" + //
            "===================\n" + //
            "Menu Funcionários\n" + //
            "1 - Cadatrar Funcionário\n" + //
            "2 - Buscar Funcionário\n" + //
            "3 - Listar todos os funcionários\n" + //
            "99 - Sair do Software");

    private String valor;

    public String getValor() {
        return valor;
    }

    ConstantesGUI(String valor) {
        this.valor = valor;
    }
}
