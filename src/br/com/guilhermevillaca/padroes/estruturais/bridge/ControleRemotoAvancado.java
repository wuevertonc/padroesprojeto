/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.guilhermevillaca.padroes.estruturais.bridge;

/**
 *
 * @author Wueve
 */
public class ControleRemotoAvancado extends ControleRemoto {

    public ControleRemotoAvancado(Dispositivo dispositivo) {
        super(dispositivo);
    }

    @Override
    public void ligarDesligar() {
        if (dispositivo.estaLigado()){
        dispositivo.desligar();
        }
        else{
        dispositivo.ligar();
        }
    }

    @Override
    public void aumentarVolume() {
        dispositivo.aumentarVolume();
    }

    @Override
    public void diminuirVolume() {
        dispositivo.diminuirVolume();
    }

    @Override
    public void silenciar() {
        System.out.println("dispositivo silenciado");
        while (dispositivo.estaLigado()){
        dispositivo.diminuirVolume();
        }
    }    
}
