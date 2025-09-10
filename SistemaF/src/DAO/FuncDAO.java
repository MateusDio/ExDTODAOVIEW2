
package DAO;

import DTO.FuncDTO;
import java.util.ArrayList;
import java.util.List;


public class FuncDAO {
        private List<FuncDTO> func = new ArrayList<>();

    public void adicionarProduto(FuncDTO funcs) {
        func.add(funcs);
        
    }

   public void listarProdutos() {
    if (func.isEmpty()) {
        System.out.println("Nenhum funcionário cadastrado.");
    } else {
        for (FuncDTO funcs : func) {
            System.out.println(funcs);
        }
    }
}
}
