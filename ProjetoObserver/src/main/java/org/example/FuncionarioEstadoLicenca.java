package org.example;

public class FuncionarioEstadoLicenca extends FuncionarioEstado {

    private FuncionarioEstadoLicenca() {}

    private static FuncionarioEstadoLicenca instance;

    public static FuncionarioEstadoLicenca getInstance() {
        if (instance == null) {
            instance = new FuncionarioEstadoLicenca();
        }
        return instance;
    }

    @Override
    public String getEstado() {
        return "Licença";
    }

    @Override
    public boolean ativo(Funcionario funcionario) {
        funcionario.setEstado(FuncionarioEstadoAtivo.getInstance());
        return true;
    }

}
