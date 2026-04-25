package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    Funcionario funcionario;

    @BeforeEach
    void setUp() {
        funcionario = new Funcionario();
    }


    @Test
    void deveNotificarOEstadoInicialDoFuncionarioComoAtivo(){
        funcionario.setEstado(funcionario.getEstado());
        assertEquals("Situação do Funcionario: Ativo", funcionario.getEstado().getUltimaNotificacao());
    }

    @Test
    void deveNotificarFuncionarios(){
        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();
        funcionario1.setEstado(FuncionarioEstadoFerias.getInstance());
        funcionario2.setEstado(FuncionarioEstadoDesligado.getInstance());
        assertEquals("Situação do Funcionario: Férias", funcionario1.getEstado().getUltimaNotificacao());
        assertEquals("Situação do Funcionario: Desligado", funcionario2.getEstado().getUltimaNotificacao());
    }

    @Test
    void deveAlterarEstadoDeUmFuncionario(){
        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();
        funcionario1.setEstado(FuncionarioEstadoFerias.getInstance());
        funcionario2.setEstado(funcionario.getEstado());
        assertEquals("Situação do Funcionario: Férias", funcionario1.getEstado().getUltimaNotificacao());
        assertEquals("Situação do Funcionario: Ativo", funcionario2.getEstado().getUltimaNotificacao());
    }

    @Test
    public void deveEntrarDeFeriasFuncionarioAtivo() {
        funcionario.setEstado(FuncionarioEstadoAtivo.getInstance());
        assertTrue(funcionario.ferias());
        assertEquals("Situação do Funcionario: Férias", funcionario.getEstado().getUltimaNotificacao());
    }

    @Test
    public void deveEntrarDeLicencaFuncionarioAtivo() {
        funcionario.setEstado(FuncionarioEstadoAtivo.getInstance());
        assertTrue(funcionario.licenca());
        assertEquals("Situação do Funcionario: Licença", funcionario.getEstado().getUltimaNotificacao());
    }

    @Test
    public void deveAposentarFuncionarioAtivo() {
        funcionario.setEstado(FuncionarioEstadoAtivo.getInstance());
        assertTrue(funcionario.aposentar());
        assertEquals("Situação do Funcionario: Aposentado", funcionario.getEstado().getUltimaNotificacao());
    }

    @Test
    public void deveDesligarFuncionarioAtivo() {
        funcionario.setEstado(FuncionarioEstadoAtivo.getInstance());
        assertTrue(funcionario.desligar());
        assertEquals("Situação do Funcionario: Desligado", funcionario.getEstado().getUltimaNotificacao());
    }

    @Test
    public void deveAtivarFuncionarioDeFerias() {
        funcionario.setEstado(FuncionarioEstadoFerias.getInstance());
        assertTrue(funcionario.ativo());
        assertEquals("Situação do Funcionario: Ativo", funcionario.getEstado().getUltimaNotificacao());
    }

    @Test
    public void deveAtivarFuncionarioDeLicenca() {
        funcionario.setEstado(FuncionarioEstadoLicenca.getInstance());
        assertTrue(funcionario.ativo());
        assertEquals("Situação do Funcionario: Ativo", funcionario.getEstado().getUltimaNotificacao());
    }

}