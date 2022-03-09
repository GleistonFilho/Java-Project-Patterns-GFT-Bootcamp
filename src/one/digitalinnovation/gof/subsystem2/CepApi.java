package one.digitalinnovation.gof.subsystem2;

import one.digitalinnovation.gof.singleton.SingletonEager;

public class CepApi {
    private  static CepApi instancia = new CepApi();

    private CepApi(){}

    public static CepApi getInstancia(){
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "Cidade";
    }
    public String recuperarEstado(String cep){
        return "Estado";
    }
}
