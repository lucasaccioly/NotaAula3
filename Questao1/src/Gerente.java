import java.util.Date;

public class Gerente
        extends Funcionario {
        private String projeto;

        public Gerente(String nome, Date nasc, double salario, String projeto) {
            super(nome, nasc, salario);
            this.projeto = projeto;
        }

        public void informarProjeto() {
            System.out.println("Projeto: " + projeto);
        }


        public String getProjeto() {
            return projeto;
        }

        public void setProjeto(String projeto) {
            this.projeto = projeto;
        }
    }
