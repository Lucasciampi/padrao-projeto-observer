package org.example;

import java.util.Observable;

public class Funcionario extends Observable{

    private FuncionarioEstado estado;

    public Funcionario() {
        this.setEstado(FuncionarioEstadoAtivo.getInstance());
    }

    public void setEstado(FuncionarioEstado estado) {
        this.estado = estado;
        atualizarFuncionario();
    }

    public FuncionarioEstado getEstado() {
        return estado;
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public boolean ativo() {
        return estado.ativo(this);
    }

    public boolean ferias() {
        return estado.ferias(this);
    }

    public boolean licenca() {
        return estado.licenca(this);
    }

    public boolean aposentar() {
        return estado.aposentar(this);
    }

    public boolean desligar() {
        return estado.desligar(this);
    }

    public void atualizarFuncionario() {
        estado.atualizarEstadoFuncionario(this);
        setChanged();
        notifyObservers();
    }

    public String toString() {
        return this.getNomeEstado();
    }


}
