import controller.FuncionarioController;
import model.Funcionario;
import java.util.Date;
public class MainVetor {
    public static void main(String[] args) {
        Funcionario[] colaborador = new Funcionario[3];
        FuncionarioController controller = new FuncionarioController();

        colaborador[0] = new Funcionario();
        colaborador[0].setIdentificacao(1);
        colaborador[0].setCpfCnpj("358.252,858,23");
        colaborador[0].setDepartamento("RH");
        colaborador[0].setCargo("Gerente");
        colaborador[0].setSalario(5000.0);
        colaborador[0].setData(new Date());

        colaborador[1] = new Funcionario();
        colaborador[1].setIdentificacao(2);
        colaborador[1].setCpfCnpj("355.265,656,33");
        colaborador[1].setDepartamento("TI");
        colaborador[1].setCargo("Programador");
        colaborador[1].setSalario(4000.0);
        colaborador[1].setData(new Date());

        controller.readAll().forEach(c -> {
            System.out.println(c.getIdentificacao() + " ---" + c.getDepartamento() + " ---" + c.getCargo() + " ---" + c.getSalario() + " ---" + c.getData());
        });

       Funcionario update = new Funcionario();
       update.setIdentificacao(3);
       update.setDepartamento("Usinagem");
       update.setCargo("Preparador");
       update.setSalario(3300.0);
       update.setCpfCnpj("356.250,856,53");
       update.setData(new Date());

        if (controller.update("3", update)) {
            System.out.println("-------------------------------");
            System.out.println("Atualizado com sucesso");
        } else {
            System.out.println("Não foi possível atualizar");
        }
        controller.readAll().forEach(c -> {
            System.out.println(c.getIdentificacao() + " ---" + c.getDepartamento()+ " ---" + c.getCargo() + " ---" + c.getSalario() + " ---" + c.getCpfCnpj()+ " ---" + c.getData());
        });
        update = new Funcionario();
        update.setIdentificacao(5);
        update.setDepartamento("Usinagem");
        update.setCargo("Lider de usinagem");
        update.setSalario(4000.0);
        update.setCpfCnpj("399.356.698.22");
        update.setData(new Date());



        if (controller.update("39935669822", update)) {
            System.out.println("-------------------------------");
            System.out.println("Atualizado com sucesso");
        } else {
            System.out.println("Não foi possível atualizar");
        }
        controller.readAll().forEach(c -> {
            System.out.println(c.getIdentificacao() + " ---" + c.getDepartamento() + " ---" + c.getCargo() + " ---" + c.getSalario() + " ---" +c.getCpfCnpj() + " ---" + c.getData());
        });

    }
}
