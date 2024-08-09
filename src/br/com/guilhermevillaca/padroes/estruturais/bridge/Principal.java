/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.guilhermevillaca.padroes.estruturais.bridge;

/**
 *
 * @author Wueve
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dispositivo tv = new Televisão();
        ControleRemoto controleBasico = new ControleRemotoBasico(tv);
        
        System.out.println("usando controle básico");
        controleBasico.ligarDesligar();
        controleBasico.aumentarVolume();
        controleBasico.diminuirVolume();
        controleBasico.ligarDesligar();
    }
    
}
