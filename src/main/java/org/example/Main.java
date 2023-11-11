package org.example;

import adapter.AdaptadorPS2paraUSB;
import adapter.GabineteUSB;
import adapter.MeuGabineteUSB;
import adapter.MeuTecladoPS2;
import adapter.TecladoPS2;

public class Main {
    public static void main(String[] args) {
        TecladoPS2 meuTecladoPS2 = new MeuTecladoPS2();
        GabineteUSB meuGabineteUSB = new MeuGabineteUSB();

        // Tentativa direta de conexão (sem adaptador)
        meuTecladoPS2.conectarPS2(); // Conectando teclado PS2...
        meuGabineteUSB.conectarUSB(); // Conectando gabinete USB...

        System.out.println("\n");

        // Usando adaptador para conectar o teclado PS2 ao gabinete USB
        AdaptadorPS2paraUSB adaptador = new AdaptadorPS2paraUSB(meuTecladoPS2);
        adaptador.conectarUSB();
    }
}