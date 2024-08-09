package br.com.guilhermevillaca.padroes.estruturais.adapter;

/**
 *
 * @author guilherme.villaca
 */
public class AdaptadorPagamento implements SistemaPagamentoNovo {

    private SistemaPagamentoAntigo sistemaPagamentoAntigo;

    public AdaptadorPagamento(SistemaPagamentoAntigo sistemaPagamentoAntigo) {
        this.sistemaPagamentoAntigo = sistemaPagamentoAntigo;
    }

    @Override
    public void processarPagamento(String clienteId, double valor) {
        sistemaPagamentoAntigo.realizarPagamento(clienteId, valor);
    }

}
