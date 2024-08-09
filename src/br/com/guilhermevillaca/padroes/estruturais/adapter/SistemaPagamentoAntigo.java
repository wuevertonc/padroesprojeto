package br.com.guilhermevillaca.padroes.estruturais.adapter;

/**
 *
 * @author guilherme.villaca
 */
public class SistemaPagamentoAntigo {
    public void realizarPagamento(String conta, double valor){
        System.out.println("Pagamento de " + valor +
                " realizado para a conta " + conta +
                " usando o Sistema de Pagamento Antigo");
    }
}
