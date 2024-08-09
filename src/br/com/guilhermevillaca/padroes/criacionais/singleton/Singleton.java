package br.com.guilhermevillaca.padroes.criacionais.singleton;

/**
 *
 * @author guilherme.villaca
 */
public class Singleton {    
    //A unica instancia da classe
    private static Singleton instancia;
    
    //Criar um construtor privado
    //Evitar instancias externas
    private Singleton(){        
    }
    
    public static Singleton getInstancia(){
        if(instancia == null){
            instancia = new Singleton();
        }
        return instancia;
    }    
    public void mostrarMensagem(){
        System.out.println("Mensagem padrao instancia Singleton");
    }
}
