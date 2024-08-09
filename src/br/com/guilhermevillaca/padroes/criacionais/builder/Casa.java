package br.com.guilhermevillaca.padroes.criacionais.builder;

/**
 *
 * @author guilherme.villaca
 */
public class Casa {
    
    private String paredes;
    private String telhado;
    private String portas;
    private String janelas;

    public String getParedes() {
        return paredes;
    }

    public String getTelhado() {
        return telhado;
    }

    public String getPortas() {
        return portas;
    }

    public String getJanelas() {
        return janelas;
    }
    
    private Casa(){
        //
    }
    
    public Casa(Builder builder){
        this.paredes = builder.paredes;
        this.telhado = builder.telhado;
        this.portas = builder.portas;
        this.janelas = builder.janelas;
    }

}
