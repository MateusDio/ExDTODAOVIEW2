
package DTO;


public class ReservaDTO {
    String cliente;
    int n,dataEnt,dataSai;

    public ReservaDTO(String cliente, int n, int dataEnt, int dataSai) {
        this.cliente = cliente;
        this.n = n;
        this.dataEnt = dataEnt;
        this.dataSai = dataSai;
    }

   
    
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getDataEnt() {
        return dataEnt;
    }

    public void setDataEnt(int dataEnt) {
        this.dataEnt = dataEnt;
    }

    public int getDataSai() {
        return dataSai;
    }

    public void setDataSai(int dataSai) {
        this.dataSai = dataSai;
    }

    @Override
    public String toString() {
        return "ReservaDTO{" + "cliente=" + cliente + ", n=" + n + ", dataEnt=" + dataEnt + ", dataSai=" + dataSai + '}';
    }
    
    
}
