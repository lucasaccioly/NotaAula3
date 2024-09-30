import java.util.Date;

public class Funcionario {
    private String nome;
    private Date nasc;
    private double salario;

    public Funcionario(String nome, Date nasc, double salario) {
        this.nome = nome;
        this.nasc = nasc;
        this.salario = salario;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getNasc() {
        return nasc;
    }

    public void setNasc(Date nasc) {
        this.nasc = nasc;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
