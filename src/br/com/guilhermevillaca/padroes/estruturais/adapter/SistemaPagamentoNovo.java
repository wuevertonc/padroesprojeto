package br.com.guilhermevillaca.padroes.estruturais.adapter;

/**
 *
 * @author guilherme.villaca
 */
public interface SistemaPagamentoNovo {
    void processarPagamento(String clienteId, double valor);
}
