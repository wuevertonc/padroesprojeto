/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.guilhermevillaca.padroes.estruturais.bridge;

/**
 *
 * @author Wueve
 */
public abstract class ControleRemoto {
    protected Dispositivo dispositivo;
    public ControleRemoto(Dispositivo dispositivo){
    this.dispositivo = dispositivo;
    }
    
    public abstract void ligarDesligar();
    public abstract void aumentarVolume();
    public abstract void diminuirVolume();
    public abstract void silenciar();
}
