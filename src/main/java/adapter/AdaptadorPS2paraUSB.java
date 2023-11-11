package adapter;

public class AdaptadorPS2paraUSB implements GabineteUSB {
    private TecladoPS2 tecladoPS2;

    public AdaptadorPS2paraUSB(TecladoPS2 tecladoPS2) {
        this.tecladoPS2 = tecladoPS2;
    }

    @Override
    public void conectarUSB() {
        tecladoPS2.conectarPS2();
        System.out.println("Adaptando a conexão para USB...");
        System.out.println("Conectando ao gabinete USB.");
    }
}
