package com.senac.loja;

import java.util.ArrayList;
import java.util.List;

public class Gerente extends Pessoa implements Colaborador{

    private double salario;
    List<Vendedor> vendedores = new ArrayList<>();

    public Gerente(String cpf, String email, String nome, double salario) {
        super(cpf, email, nome);
        this.salario = salario;
    }

    public void adicionaVendedor(Vendedor vendedor){
        this.vendedores.add(vendedor);
    }

    private double totalVendas(){
        return this.vendedores.stream().map(v->v.totalVendas()).reduce(0.0,Double::sum);
    }
    @Override
    public double calcularSalario() {
        return this.salario + this.totalVendas() * 0.15;
    }
}
