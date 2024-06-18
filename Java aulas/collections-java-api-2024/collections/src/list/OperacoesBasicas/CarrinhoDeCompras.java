package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
        private List < Item > itemlList;

    public CarrinhoDeCompras() {
        this.itemlList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itemlList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem (String nome) {
       List < Item >  itensParaRemover = new ArrayList<>();
       for (Item m : itemlList) {
            if (m.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(m);
            }
        }
        itemlList.removeAll(itensParaRemover);
    }

    public void calcularValorTotal() {
        List < Item >  itensParaSomar = new ArrayList<>();

        Double total = 0.0;

        for (Item g : itemlList) {
            total += g.getPreco()* g.getQuantidade();
            }
        System.out.println("Total do carrinho é: Unidades de dinheiro " + total);

    }
    public void exibirItens(){
        if (itemlList.isEmpty()) {
            System.out.println("A lista de itens está vazia.");
        } else {
            System.out.println(itemlList);
        }
    }


    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.adicionarItem("Sapato", 180, 2);
        carrinhoDeCompras.adicionarItem("Bota", 280, 1);
        carrinhoDeCompras.adicionarItem("Bolsa", 500, 1);


        carrinhoDeCompras.calcularValorTotal();

        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.removerItem("Bolsa");

        carrinhoDeCompras.calcularValorTotal();


    }
}