package org.example;

public class FuncionarioEstadoDesligado extends FuncionarioEstado{

    private FuncionarioEstadoDesligado() {}

    private static FuncionarioEstadoDesligado instance;

    public static FuncionarioEstadoDesligado getInstance() {
        if (instance == null) {
            instance = new FuncionarioEstadoDesligado();
        }
        return instance;
    }

    @Override
    public String getEstado() {
        return "Desligado";
    }
}
