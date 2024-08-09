package br.com.guilhermevillaca.padroes.criacionais.singleton;

/**
 *
 * @author guilherme.villaca
 */
public class Principal {

    public static void main(String[] args) {
        //Obter a unica instancia
        Singleton singleton1 = Singleton.getInstancia();
        Singleton singleton2 = Singleton.getInstancia();
        
        System.out.println("instancia 1");
        singleton1.mostrarMensagem();
        
        System.out.println("instancia 2");
        singleton2.mostrarMensagem();
        
        System.out.println("---------------");
        if(singleton1 == singleton2){
            System.out.println("As instancias sao iguais");
        }else{
            System.out.println("As instancias sao diferentes");
        }
    }
}
