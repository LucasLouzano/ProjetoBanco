import java.util.ArrayList;
import java.util.List;

import Model.Funcionario;

public class Mainfuncionarios {
    public static void main(String[] args) {
        List<Funcionario> funcionario = new ArrayList<>();
        Funcionario f1 = new Funcionario();
        f1.setNome("Rafael");
        f1.setIdentificacao(502);
        f1.setDepartamento("Sistemas da Informação");
        f1.setCargo("Analista");
        funcionario.add(f1); // Adicionar funcionários à lista

        // Ler todos os funcionários

        // Atualizar um funcionário
        Funcionario funcionarioAtualizado = new Funcionario();
        // funcionario.add(f1);
        int indiceParaAtualizar = funcionario.indexOf(funcionarioAtualizado);
        if (indiceParaAtualizar != -1) {
            funcionario.set(indiceParaAtualizar, funcionarioAtualizado);
        }

        // Excluir um funcionário
        Funcionario funcionarioParaExcluir = new Funcionario();
        // funcionario.add(f1);
        funcionario.remove(funcionarioParaExcluir);

        // Ler novamente a lista, Lista após atualização e exclusão
        for (Funcionario funcionarios : funcionario) {
            System.out.println(funcionario);
        }
    }
}
