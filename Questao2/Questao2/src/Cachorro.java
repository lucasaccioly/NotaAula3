public class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }

    public void late() {
        System.out.println(getNome() + " está latindo.");
    }

    public void caminha() {
        super.caminha();
    }
}