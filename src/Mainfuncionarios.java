import Funcionarios.Funcionarios;

import java.util.ArrayList;
import java.util.List;

public class Mainfuncionarios {
    public static void main(String[] args) {
        List<Funcionarios> funcionario = new ArrayList<>();
        Funcionarios f1 = new Funcionarios();
        f1.setNome("Rafael");
        f1.setIdentificacao(502);
        f1.setDepartamento("Sistemas da Informação");
        f1.setCargo("Analista");
        funcionario.add(f1);  // Adicionar funcionários à lista

        //Ler todos os funcionários
        for (Funcionarios Funcionarios : funcionario) {
            System.out.println(funcionario);
        }

        //  Atualizar um funcionário
        Funcionarios funcionarioAtualizado = new Funcionarios();
       // funcionario.add(f1);
        int indiceParaAtualizar = funcionario.indexOf(funcionarioAtualizado);
        if (indiceParaAtualizar != -1) {
            funcionario.set(indiceParaAtualizar, funcionarioAtualizado);
        }

        // Excluir um funcionário
        Funcionarios funcionarioParaExcluir = new Funcionarios();
      //  funcionario.add(f1);
        funcionario.remove(funcionarioParaExcluir);

        // Ler novamente a lista, Lista após atualização e exclusão
        for (Funcionarios funcionarios : funcionario) {
            System.out.println(funcionario);
        }
    }
}
