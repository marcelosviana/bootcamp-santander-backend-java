package aparelhos;

import java.util.Locale;
import java.util.Scanner;

public class tocadorPagode implements ReprodutorMusical{
    public void tocar(){
        System.out.println("Tocando: Cheia de manias - Raça Negra");
    }
    public void pausar() {
        System.out.println("Pausando música");
    }

    public void escolherMusica(String[] args) {
        Scanner escolha = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o nome da Música");
        String musicaEscolhida = escolha.next();
        System.out.println("Tocando: " + musicaEscolhida);
    }

    }
