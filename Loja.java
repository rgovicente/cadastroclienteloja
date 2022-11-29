package com.senac.loja;

public class Loja {


    public double calcularCustoColaborador(Colaborador gerente){
        return  gerente.calcularSalario() + gerente.calcularSalario() * 0.25;
    }

}
