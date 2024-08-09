/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.guilhermevillaca.padroes.estruturais.bridge;

/**
 *
 * @author Wueve
 */
public interface Dispositivo {
    void ligar();
    void desligar();
    void aumentarVolume();
    void diminuirVolume();
    boolean estaLigado();
    
}
