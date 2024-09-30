public class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    public void mia() {
        System.out.println(getNome() + " está miando.");
    }

    public void caminha() {
        System.out.println(getNome() + " está caminhando.");
    }
}