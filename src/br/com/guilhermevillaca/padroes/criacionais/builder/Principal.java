package br.com.guilhermevillaca.padroes.criacionais.builder;

/**
 *
 * @author guilherme.villaca
 */
public class Principal {
    public static void main(String[] args) {
        //Casa simples
        Casa casaSimples = new Builder()
                .comParedes("Paredes de Tijolos")
                .comTelhado("Telhado de Telha")
                .build();
        
        System.out.println("Casa Simples");
        System.out.println("Paredes: " + casaSimples.getParedes());
        System.out.println("Telhado: " + casaSimples.getTelhado());
        
        //Criem uma completa
        Casa casaCompleta = new Builder()
                .comParedes("Parede de concreto")
                .comTelhado("Telhado de telhas")
                .comPortas("Portas de madeira")
                .comJanelas("Janelas de vidro")
                .build();
        
        System.out.println("Casa Completa");
        System.out.println("Paredes: " + casaSimples.getParedes());
        System.out.println("Telhado: " + casaSimples.getTelhado());
        System.out.println("Portas: " + casaCompleta.getPortas());
        System.out.println("Janelas: " + casaCompleta.getJanelas());
                
    }
}
