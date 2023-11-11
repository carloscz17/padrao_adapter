package adapter;

public class MeuTecladoPS2 implements TecladoPS2 {
    @Override
    public void conectarPS2() {
        System.out.println("Conectando teclado PS2...");
    }
}
