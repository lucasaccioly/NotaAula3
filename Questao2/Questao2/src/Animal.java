public class Animal {
    private String nome;
    private String raca;

    public Animal() {}

    public Animal(String nome) {
        this.nome = nome;
    }

    protected String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected String getRaca() {
        return raca;
    }

    protected void setRaca(String raca) {
        this.raca = raca;
    }

    protected void caminha() {
    }
}