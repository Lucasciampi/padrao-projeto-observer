package org.example;

public class FuncionarioEstadoAtivo extends FuncionarioEstado{

    private FuncionarioEstadoAtivo() {}

    private static FuncionarioEstadoAtivo instance;

    public static FuncionarioEstadoAtivo getInstance() {
        if (instance == null) {
            instance = new FuncionarioEstadoAtivo();
        }
        return instance;
    }

    @Override
    public String getEstado() {
        return "Ativo";
    }

    @Override
    public boolean ferias (Funcionario funcionario) {
        funcionario.setEstado(FuncionarioEstadoFerias.getInstance());
        return true;
    }

    @Override
    public boolean licenca (Funcionario funcionario) {
        funcionario.setEstado(FuncionarioEstadoLicenca.getInstance());
        return true;
    }

    @Override
    public boolean aposentar(Funcionario funcionario) {
        funcionario.setEstado(FuncionarioEstadoAposentado.getInstance());
        return true;
    }

    @Override
    public boolean desligar(Funcionario funcionario) {
        funcionario.setEstado(FuncionarioEstadoDesligado.getInstance());
        return true;
    }

}
