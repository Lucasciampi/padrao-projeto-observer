package org.example;

public class FuncionarioEstadoFerias extends FuncionarioEstado{

    private FuncionarioEstadoFerias() {}

    private static FuncionarioEstadoFerias instance;

    public static FuncionarioEstadoFerias getInstance() {
        if (instance == null) {
            instance = new FuncionarioEstadoFerias();
        }
        return instance;
    }

    @Override
    public String getEstado() {
        return "Férias";
    }

    @Override
    public boolean ativo(Funcionario funcionario) {
        funcionario.setEstado(FuncionarioEstadoAtivo.getInstance());
        return true;
    }
}
