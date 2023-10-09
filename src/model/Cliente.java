package model;

public class Cliente extends PessoaAbstrata {


    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Cliente{" + " ,id ='" + getId()+ '\'' + "'Nome ='" + getNome() + '\'' + ", Email ='" + getEmail() + '\'' + ", CpfCnpj ='" + getCpfCnpj() + '\''  + ", Idade ='" + getIdade() + '\''+ ", Data ='" + '\''+ getData() + '}';


    }
}
