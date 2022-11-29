package com.senac.loja;

import java.util.ArrayList;
import java.util.List;

public class NotaFiscal {
    private Cliente cliente;

    List<Produto> produtoList = new ArrayList<>();
    private Vendedor vendedor;

    private int quantidade;

    public static double desconto = 15;

    public NotaFiscal(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getValorTotal(){
      double valor = produtoList.stream()
                .map(p -> p.getPreco())
                .reduce(0.0, Double::sum);

        return valor + valor *  (desconto / 100);
    }

    public void adicionaProduto(Produto produto){
        produtoList.add(produto);
    }


    public Cliente getCliente() {
        return cliente;
    }


    public int getQuantidade() {
        return quantidade;
    }

    public Vendedor getVendedor(){
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public List<Produto> getProdutoList() {
        return produtoList;
    }
}
