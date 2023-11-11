package adapter;

public class MeuGabineteUSB implements GabineteUSB {
    @Override
    public void conectarUSB() {
        System.out.println("Conectando gabinete USB...");
    }
}