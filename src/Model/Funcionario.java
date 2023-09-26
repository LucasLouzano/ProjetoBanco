package Model;

public class Funcionario extends PessoaAbstrata {

    private int identificacao;
    private String departamento;
    private String cargo;
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(int identificacao) {
        this.identificacao = identificacao;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Funcionarios{" +
                ", identificacao ='" + identificacao + '\'' +
                ", departamento ='" + departamento + '\'' +
                ", cargo ='" + cargo + '\'' +
                '}';
    }
}
