package br.com.daniel.produtos.view;

import br.com.daniel.produtos.model.Categoria;
import br.com.daniel.produtos.repository.CategoriaCollectionRepository;

import javax.swing.*;

public class CategoriaView {

    static CategoriaCollectionRepository repository;

    public static Categoria select(Categoria categoria) {
        // @formatter
        Categoria ret = (Categoria) JOptionPane.showInputDialog(
                null, // componente pai. como não temos sera null
                "selecione uma categoria",
                "Menu",
                JOptionPane.QUESTION_MESSAGE,
                null, //icone
                repository.findAll().toArray(), // numero da opção
                categoria == null ? 1 : categoria);
        return ret;
        // @formatter : on

    }

    public void sucesso(){
        JOptionPane.showMessageDialog(null,"Categoria Salva com Sucesso!");
    }

    public void sucesso(Categoria categoria){
        JOptionPane.showMessageDialog(null,"Categoria " + categoria.getNome() +" Salva com Sucesso!");
    }

    public static Categoria form(Categoria categoria){
        String nome = JOptionPane.showInputDialog(null,
                "informe o nome da categoria",
                categoria!= null ? categoria.getNome() : "");
        return new Categoria(nome);
    }


}
