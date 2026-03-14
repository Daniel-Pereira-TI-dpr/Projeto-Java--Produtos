package br.com.daniel.produtos.view;

import javax.swing.*;

public class OpcaoView {

    public static Opcao select (){

        Opcao ret = (Opcao) JOptionPane.showInputDialog(
                null, //componente pai. como não temos será null
                "Selecione uma opção",
                "Menu",
                JOptionPane.QUESTION_MESSAGE,
                null, //icone
                Opcao.values(), // Número
                Opcao.CADASTRAR_PRODUTO);

        return ret != null ? ret : Opcao.ENCERAR_SISTEMA;
    }
}
