public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Lovell");
        cachorro.caminha();
        cachorro.late();

        Gato gato = new Gato("Opium");
        gato.caminha();
        gato.mia();
    }
}