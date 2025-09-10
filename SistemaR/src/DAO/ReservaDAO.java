/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.ReservaDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno.saolucas
 */
public class ReservaDAO {

    private List<ReservaDTO> reserva = new ArrayList<>();

    public void adicionarProduto(ReservaDTO reservas) {
        reserva.add(reservas);

    }

    public void listarProdutos() {
        if (reserva.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        } else {

        }
    }
}
