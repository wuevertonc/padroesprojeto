package br.com.guilhermevillaca.padroes.criacionais.factorymethod;

/**
 *
 * @author guilherme.villaca
 */
public abstract class Logistica {

    //Método fábrica
    public abstract Transporte criarTransporte();
    
    //Método para organizar a entrega
    public void organizarEntrega(){
        Transporte transporte = criarTransporte();
        transporte.entregar();
    }
    
    
}
