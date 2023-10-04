package org.example;

import org.example.Ordenacao.produtos.CadastroProdutos;
import org.example.map.AgendaContatos;
import org.example.map.EstoqueProdutos;

public class Main {
    public static void main(String[] args) {

        /*CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivros("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivros("Livro 1", "Autor 2", 2021);
        catalogoLivros.adicionarLivros("Livro 2", "Autor 2", 2022);
        catalogoLivros.adicionarLivros("Livro 3", "Autor 3", 2023);
        catalogoLivros.adicionarLivros("Livro 4", "Autor 4", 1994);

        System.out.println(catalogoLivros.pesquisaPorAutor("Autor 2"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2022));
*/


        /*OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoas("nome 1", 20, 1.56);
        ordenacaoPessoa.adicionarPessoas("nome 2", 30, 1.80);
        ordenacaoPessoa.adicionarPessoas("nome 3", 25, 1.70);
        ordenacaoPessoa.adicionarPessoas("nome 4", 17, 1.56);

        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
*/


     /*   ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de convidados");

        conjuntoConvidados.adicionarConvidado("Convidado1", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado2", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado3", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado4", 1236);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de convidados");
*/


     /*   AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Luiz", 123456);
        agendaContatos.adicionarContato("laura", 654321);
        agendaContatos.adicionarContato("Gislaine", 456123);
        agendaContatos.adicionarContato("Luiz", 142536);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Luiz"));
        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Luiz", 465456));*/


       /* CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto(1L, "Produto 5", 15d, 5);
        cadastroProdutos.adicionarProduto(2L, "Produto 0", 20d, 10);
        cadastroProdutos.adicionarProduto(1L, "Produto 3", 10d, 2);
        cadastroProdutos.adicionarProduto(9L, "Produto 9", 2d, 2);

        System.out.println(cadastroProdutos.produtoSet);
        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());*/

       /* AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("luiz", 123456);
        agendaContatos.adicionarContato("Gislaine", 654321);
        agendaContatos.adicionarContato("Laura", 123654);
        agendaContatos.adicionarContato("Fellipe", 135246);
        agendaContatos.exibirContatos();

        agendaContatos.removerContatos("Fellipe");
        agendaContatos.exibirContatos();


        System.out.println("O Número é: " + agendaContatos.pesquisarPorNome("luiz"));*/

        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.exibirProdutos();

        estoque.adicionarProduto(1L, "Produto A", 10, 5.0);
        estoque.adicionarProduto(2L, "Produto B", 5, 10.0);
        estoque.adicionarProduto(3L, "Produto C", 2, 15.0);

        estoque.exibirProdutos();

        System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());
        System.out.println("Produto mais barato: " + estoque.obterProdutoMaisBarato());
        System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());

    }
}
