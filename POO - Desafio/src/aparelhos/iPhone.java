package aparelhos;

import java.util.Locale;
import java.util.Scanner;

public class iPhone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {

    public void tocar() {
        System.out.println("Tocando música aleatória");
    }

    public void pausar() {
        System.out.println("Pausando música");
    }

    public void escolherMusica() {
        Scanner escolha = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o nome da Música");
        String musicaEscolhida = escolha.next();
        System.out.println("Tocando: " + musicaEscolhida);
    }

    public void ligar() {
        Scanner numeroTelefone = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o número de telefone com 9 dígitos:");
        String discado = numeroTelefone.next();
        System.out.println("Chamando o número: " + discado);

    }

    public void atender() {
        System.out.println("Ligação atendida");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Sua chamada esta sendo encaminhada para caixa postal e estará sujeita acobrança apos o sinal: ");
    }

    public void exibirPagina() {
        Scanner pagina = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o URL da pagina: ");
        String paginaEscolhida = pagina.next();
        System.out.println("Exibindo: " + paginaEscolhida);
    }

    public void adicionarNovaAba() {
        System.out.println("New tab");
    }

    public void atualizandoPagina() {
        System.out.println("Aguarde, atualizando pagina ... ");
    }
}