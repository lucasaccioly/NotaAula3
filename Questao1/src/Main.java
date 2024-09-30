import java.util.Date;

    public class Main {
        public static void main(String[] args) {
            Gerente gerente = new Gerente("João", new Date(), 5000.0, "Projeto V1");
            gerente.informarProjeto();

            Programador programador = new Programador("Vitória", new Date(), 4000.0, "Java");
            programador.informarLinguagem();
        }
    }
