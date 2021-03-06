package br.com.orientacao.objeto.testes;

import br.com.orientacao.objeto.Autor;
import br.com.orientacao.objeto.CarrinhoDeCompras;
import br.com.orientacao.objeto.produtos.Ebook;
import br.com.orientacao.objeto.produtos.LivroFisico;
import br.com.orientacao.objeto.produtos.Produto;

import java.util.List;

public class RegistroDeVendas {

    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("Mauricio Aniche");

        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Test-Driven Development");
        fisico.setValor(59.90);

        Ebook ebook = new Ebook(autor);
        ebook.setNome("Test-Driven Development");
        ebook.setValor(29.90);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        if (fisico.aplicaDescontoDe10Porcento()) {
            System.out.println("Valor agora é " + fisico.getValor());
        }

        carrinho.adiciona(fisico);
        carrinho.adiciona(ebook);

        System.out.println("Total " + carrinho.getTotal());

        List<Produto> produtos = carrinho.getProdutos();

        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

}