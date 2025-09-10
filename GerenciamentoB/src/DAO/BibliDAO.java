/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.BibliDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno.saolucas
 */
public class BibliDAO {
            private List<BibliDTO> livro = new ArrayList<>();

    public void adicionarProduto(BibliDTO livros) {
        livro.add(livros);
        
    }

   public void listarProdutos() {
    if (livro.isEmpty()) {
        System.out.println("Nenhum livro cadastrado.");
    } else {
        for (BibliDTO livros : livro) {
            System.out.println(livros);
        }
    }
}
public void removerUltimoProduto() {
    if (livro.isEmpty()) {
        System.out.println("Nenhum livro cadastrado.");
    } else {
        livro.remove(livro.size() - 1); 
        System.out.println("Último livro removido com sucesso!");
    }
}
}
