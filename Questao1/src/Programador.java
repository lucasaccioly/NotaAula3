import java.util.Date;

public class Programador extends Funcionario {
        private String linguagem;

        public Programador(String nome, Date nasc, double salario, String linguagem) {
            super(nome, nasc, salario);
            this.linguagem = linguagem;
        }

        public void informarLinguagem() {
            System.out.println("Linguagem: " + linguagem);
        }


        public String getLinguagem() {
            return linguagem;
        }

        public void setLinguagem(String linguagem) {
            this.linguagem = linguagem;
        }
    }
