package one.digitalInovation.gof.facade;

import subsistema1.CrmService;
import subsistema2.CepApi;

public class Facade {
    public static void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);

    }
}
