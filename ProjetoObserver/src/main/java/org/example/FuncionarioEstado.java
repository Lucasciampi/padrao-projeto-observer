package org.example;

import java.util.Observable;
import java.util.Observer;

public abstract class FuncionarioEstado implements Observer {

    private String ultimaNotificacao;

    public abstract String getEstado();

    public boolean ativo( Funcionario funcionario) {
        return false;
    }

    public boolean ferias(Funcionario funcionario) {
        return false;
    }

    public boolean licenca(Funcionario funcionario) {
        return false;
    }

    public boolean aposentar(Funcionario funcionario) {
        return false;
    }

    public boolean desligar(Funcionario funcionario) {
        return false;
    }

    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public void atualizarEstadoFuncionario(Funcionario funcionario) {
        funcionario.addObserver(this);
    }

    public void update(Observable funcionario, Object arg1) {
        this.ultimaNotificacao = "Situação do Funcionario: " + funcionario.toString();
    }


}
