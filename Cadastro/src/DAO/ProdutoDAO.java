package DAO;

import DTO.ProdutoDTO;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {

    private List<ProdutoDTO> produtos = new ArrayList<>();

    public void adicionarProduto(ProdutoDTO produto) {
        produtos.add(produto);
    }

   public void listarProdutos() {
    if (produtos.isEmpty()) {
        System.out.println("Nenhum produto cadastrado.");
    } else {
        for (ProdutoDTO produto : produtos) {
            System.out.println(produto);
        }
    }
}
}