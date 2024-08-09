package br.com.guilhermevillaca.padroes.criacionais.factorymethod;

/**
 *
 * @author guilherme.villaca
 */
public class LogisticaFerroviaria extends Logistica{

    @Override
    public Transporte criarTransporte() {
        return new TransporteFerroviario();
    }
    
    

}
