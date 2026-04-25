package org.example;

public class FuncionarioEstadoAposentado extends FuncionarioEstado{

    private FuncionarioEstadoAposentado() {}

    private static FuncionarioEstadoAposentado instance;

    public static FuncionarioEstadoAposentado getInstance() {
        if (instance == null) {
            instance = new FuncionarioEstadoAposentado();
        }
        return instance;
    }

    @Override
    public String getEstado() {
        return "Aposentado";
    }

}
