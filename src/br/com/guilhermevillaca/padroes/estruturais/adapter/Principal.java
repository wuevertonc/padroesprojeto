package br.com.guilhermevillaca.padroes.estruturais.adapter;

/**
 *
 * @author guilherme.villaca
 */
public class Principal {
    
    public static void main(String[] args) {
        
        SistemaPagamentoAntigo sistemaPagamentoAntigo = 
                new SistemaPagamentoAntigo();
        SistemaPagamentoNovo sistemaPagamentoNovo = 
                new AdaptadorPagamento(sistemaPagamentoAntigo);
        
        sistemaPagamentoNovo.processarPagamento("12345", 1999.99);
    }

}
