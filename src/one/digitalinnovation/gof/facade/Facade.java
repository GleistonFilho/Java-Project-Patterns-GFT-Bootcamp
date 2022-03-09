package one.digitalinnovation.gof.facade;

import one.digitalinnovation.gof.subsystem1.CrmService;
import one.digitalinnovation.gof.subsystem2.CepApi;

public class Facade {
    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);
        CrmService.gravatCliente(nome, cep, estado, cidade);
    }
}
