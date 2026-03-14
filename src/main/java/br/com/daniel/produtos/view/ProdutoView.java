package br.com.daniel.produtos.view;

import br.com.daniel.produtos.model.Categoria;
import br.com.daniel.produtos.model.Produto;
import br.com.daniel.produtos.repository.ProdutoCollectionRepository;

import javax.swing.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ProdutoView {

    public static Produto form(Produto produto) {

        Categoria categoria = null;

        do {
            categoria = CategoriaView.select(produto.getCategoria());
        }while (categoria == null);

        String nome = "";

        do {
            nome = JOptionPane.showInputDialog(null, "Nome do Produto", produto.getNome());
        }while (nome.equals(""));

        String descricao = "";

        do {
            descricao = JOptionPane.showInputDialog(null, "informe a descrição do produto ", produto.getDescricao());
        }while (descricao.equals(""));

        double preco = 0;

        do {
            try {
                preco = Double.parseDouble(JOptionPane.showInputDialog(null, "informe o preço do produto",  produto.getPreco()));
            } catch (Exception e) {
                preco = 0;
            }
        }while (preco <= 0);



        Produto ret = produto;

        ret.setCategoria(categoria)
                .setNome(nome)
                .setDescricao(descricao)
                .setDataDeCadastro(LocalDateTime.now())
                .setPreco(BigDecimal.valueOf(preco));

        return ret;

    }

    public void sucesso(){
        JOptionPane.showMessageDialog(null,"Produto Salvo com Sucesso!");
    }

    public static void sucesso(Produto produto){
        JOptionPane.showMessageDialog(null,"Produto " + produto.getNome() +" Salvo com Sucesso!");
    }

    public static Produto select(Produto produto) {
        // @formatter
        Produto ret = (Produto) JOptionPane.showInputDialog(
                null, // componente pai. como não temos sera null
                "selecione um Produto",
                "Menu",
                JOptionPane.QUESTION_MESSAGE,
                null, //icone
                ProdutoCollectionRepository.findAll().toArray(), // numero da opção
                produto == null ? 1 : produto);
        return ret;
        // @formatter : on

    }

    public static void update(Produto produto) {
        form(produto);
        sucesso(produto);
        show(produto);
    }

    public static void show(Produto p) {
        System.out.println(p);

        String textoFormatado = String.format("PRODUTO: " + p.getNome() + System.lineSeparator()
                + "DESCRIÇÃO: " + p.getDescricao() + System.lineSeparator()
                + "CATEGORIA: " + p.getCategoria().toString() + System.lineSeparator()
                + "PRECO: %,.2f", p.getPreco());
        JOptionPane.showMessageDialog(null,textoFormatado);
    }
}
